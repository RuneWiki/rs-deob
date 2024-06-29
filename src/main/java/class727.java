import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class727 {
   @OriginalMember(
      owner = "client!lq",
      name = "b",
      descriptor = "Z"
   )
   private boolean field10371;
   @OriginalMember(
      owner = "client!lq",
      name = "i",
      descriptor = "I"
   )
   private int field10373;
   @OriginalMember(
      owner = "client!lq",
      name = "j",
      descriptor = "Z"
   )
   private boolean field10368;
   @OriginalMember(
      owner = "client!lq",
      name = "c",
      descriptor = "I"
   )
   private int field10375;
   @OriginalMember(
      owner = "client!lq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10377 = new String[]{method5262(method5261("kq\u007fh")), method5262(method5261("iu=@7")), method5262(method5261("rm}")), method5262(method5261("~*=*b")), method5262(method5261("hep")), method5262(method5261("meeaylvvbp}")), method5262(method5261("meeav`2")), method5262(method5261("iu=E7")), method5262(method5261("iu=G7")), method5262(method5261("iu=F7")), method5262(method5261("iu=A7")), method5262(method5261("iu=B7")), method5262(method5261("iu=8vkmg:7"))};
   @OriginalMember(
      owner = "client!lq",
      name = "k",
      descriptor = "Lhha;"
   )
   public static class724 field10367 = new class724(107, 6);
   @OriginalMember(
      owner = "client!lq",
      name = "d",
      descriptor = "I"
   )
   public static int field10366;
   @OriginalMember(
      owner = "client!lq",
      name = "a",
      descriptor = "I"
   )
   public static int field10369;
   @OriginalMember(
      owner = "client!lq",
      name = "f",
      descriptor = "I"
   )
   public static int field10370;
   @OriginalMember(
      owner = "client!lq",
      name = "h",
      descriptor = "I"
   )
   public static int field10372;
   @OriginalMember(
      owner = "client!lq",
      name = "g",
      descriptor = "I"
   )
   public static int field10374;
   @OriginalMember(
      owner = "client!lq",
      name = "e",
      descriptor = "Lvca;"
   )
   public static class374 field10376;

   @OriginalMember(
      owner = "client!lq",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method5255(byte arg0) {
      try {
         ++field10366;
         if (arg0 != 17) {
            field10367 = null;
         }

         return this.field10371;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10377[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method5256(byte arg0) {
      try {
         int var2 = 35 % ((arg0 - 72) / 43);
         ++field10372;
         return this.field10375;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10377[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "d",
      descriptor = "(B)Z"
   )
   public final boolean method5257(byte arg0) {
      try {
         ++field10374;
         if (arg0 <= 2) {
            this.method5255((byte)101);
         }

         return this.field10368;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10377[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method5258(byte arg0) {
      try {
         ++field10369;
         if (arg0 < 93) {
            method5260(false);
         }

         return this.field10373;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10377[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;ZZILfea;)V"
   )
   public static final void method5259(String arg0, String arg1, boolean arg2, boolean arg3, int arg4, class82 arg5) {
      try {
         ++field10370;
         if (arg4 != 3009) {
            method5260(false);
         }

         if (!arg2) {
            class749.method5388(3, arg5, arg1, (byte)126);
         } else {
            if (class82.field1290.startsWith(field10377[2]) && arg5.field1275) {
               String var6 = null;
               if (class289.field4303 != null) {
                  var6 = class289.field4303.getParameter(field10377[6]);
               }

               if (var6 == null || !var6.equals("1")) {
                  class92 var7 = class749.method5388(0, arg5, arg1, (byte)97);
                  class742.field10568 = var7;
                  class610.field8693 = arg1;
                  class93.field1530 = arg5;
                  return;
               }
            }

            if (class82.field1290.startsWith(field10377[4])) {
               String var8 = null;
               if (class289.field4303 != null) {
                  var8 = class289.field4303.getParameter(field10377[5]);
               }

               if (var8 != null && var8.equals("1") && arg3) {
                  class76.method842(arg5, arg0, 1, (byte)104, arg1);
                  return;
               }
            }

            class749.method5388(2, arg5, arg1, (byte)94);
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field10377[1] + (arg0 != null ? field10377[3] : field10377[0]) + ',' + (arg1 != null ? field10377[3] : field10377[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field10377[3] : field10377[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method5260(boolean arg0) {
      try {
         field10376 = null;
         if (!arg0) {
            field10367 = null;
         }

         field10367 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10377[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "<init>",
      descriptor = "(ZIIZ)V"
   )
   public class727(boolean arg0, int arg1, int arg2, boolean arg3) {
      try {
         this.field10371 = arg3;
         this.field10373 = arg1;
         this.field10368 = arg0;
         this.field10375 = arg2;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field10377[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5261(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5262(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 5;
            break;
         case 1:
            var10005 = 4;
            break;
         case 2:
            var10005 = 19;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
