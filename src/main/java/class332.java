import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class332 extends class294 {
   @OriginalMember(
      owner = "client!jk",
      name = "v",
      descriptor = "I"
   )
   public int field5033;
   @OriginalMember(
      owner = "client!jk",
      name = "w",
      descriptor = "Lrca;"
   )
   public class579 field5035;
   @OriginalMember(
      owner = "client!jk",
      name = "s",
      descriptor = "Z"
   )
   public boolean field5031;
   @OriginalMember(
      owner = "client!jk",
      name = "z",
      descriptor = "I"
   )
   public int field5026;
   @OriginalMember(
      owner = "client!jk",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5036 = new String[]{method2706(method2705("b\u000fH\u0013")), method2706(method2705("wT\nQd")), method2706(method2705("f\u0011\nCpb\u0013PA1")), method2706(method2705("f\u0011\n>1")), method2706(method2705("f\u0011\n=1"))};
   @OriginalMember(
      owner = "client!jk",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field5029 = new int[]{1, 2, 4, 8};
   @OriginalMember(
      owner = "client!jk",
      name = "t",
      descriptor = "I"
   )
   public static int field5028 = 0;
   @OriginalMember(
      owner = "client!jk",
      name = "o",
      descriptor = "I"
   )
   public static int field5030 = -1;
   @OriginalMember(
      owner = "client!jk",
      name = "q",
      descriptor = "I"
   )
   public static int field5023;
   @OriginalMember(
      owner = "client!jk",
      name = "p",
      descriptor = "Lvca;"
   )
   public static class365 field5022;
   @OriginalMember(
      owner = "client!jk",
      name = "n",
      descriptor = "Z"
   )
   public boolean field5024;
   @OriginalMember(
      owner = "client!jk",
      name = "u",
      descriptor = "Z"
   )
   public boolean field5025;
   @OriginalMember(
      owner = "client!jk",
      name = "y",
      descriptor = "Z"
   )
   public boolean field5027;
   @OriginalMember(
      owner = "client!jk",
      name = "x",
      descriptor = "[Ljava/lang/Object;"
   )
   public static Object[] field5032;
   @OriginalMember(
      owner = "client!jk",
      name = "r",
      descriptor = "[[B"
   )
   public static byte[][] field5034;

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "(ILjava/lang/String;)V",
      line = 7
   )
   public static final void method2703(int arg0, String arg1) {
      boolean var2 = client.field1786;

      try {
         ++field5023;
         if (arg1 != null) {
            String var3 = class427.method3381(arg1, arg0 + 29320);
            if (var3 != null) {
               int var4 = 0;
               if (arg0 != -29320) {
                  field5028 = -36;
                  if (!var2 && ~class148.field2244 >= ~var4) {
                     return;
                  }
               } else if (~class148.field2244 >= ~var4) {
                  return;
               }

               do {
                  String var5 = class626.field9075[var4];
                  String var6 = class427.method3381(var5, arg0 ^ -29320);
                  if (class499.method3874(arg1, var6, var5, arg0 + 29320, var3)) {
                     --class148.field2244;
                     int var7 = var4;
                     if (var2) {
                        class626.field9075[var4] = class626.field9075[var4 + 1];
                        class155.field2307[var4] = class155.field2307[var4 + 1];
                        class368.field5729[var4] = class368.field5729[var4 + 1];
                        class774.field11382[var4] = class774.field11382[var4 + 1];
                        class737.field10962[var4] = class737.field10962[var4 + 1];
                        class775.field11390[var4] = class775.field11390[var4 + 1];
                        var7 = var4 + 1;
                     }

                     while(true) {
                        while(~var7 > ~class148.field2244) {
                           class626.field9075[var7] = class626.field9075[var7 + 1];
                           class155.field2307[var7] = class155.field2307[var7 + 1];
                           class368.field5729[var7] = class368.field5729[var7 + 1];
                           class774.field11382[var7] = class774.field11382[var7 + 1];
                           class737.field10962[var7] = class737.field10962[var7 + 1];
                           class775.field11390[var7] = class775.field11390[var7 + 1];
                           ++var7;
                        }

                        class746.field11069 = class1.field6;
                        ++class358.field5529;
                        class29 var8 = class578.method4332((byte)-32);
                        class577 var9 = class218.method1888(class407.field6343, 109, var8.field361);
                        var9.field8531.method2864(-26110, class714.method5292((byte)-104, arg1));
                        var9.field8531.method2862(arg1, true);
                        var8.method211(var9, 126);
                        if (!var2) {
                           return;
                        }

                        ++var7;
                     }
                  }

                  ++var4;
               } while(~class148.field2244 < ~var4);

            }
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field5036[4] + arg0 + ',' + (arg1 != null ? field5036[1] : field5036[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "(I)V",
      line = 86
   )
   public static void method2704(int arg0) {
      try {
         field5022 = null;
         if (arg0 == -19999) {
            field5034 = null;
            field5029 = null;
            field5032 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5036[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "<init>",
      descriptor = "(ILrca;IZ)V",
      line = 101
   )
   public class332(int arg0, class579 arg1, int arg2, boolean arg3) {
      try {
         this.field5033 = arg0;
         this.field5035 = arg1;
         this.field5031 = arg3;
         this.field5026 = arg2;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field5036[2] + arg0 + ',' + (arg1 != null ? field5036[1] : field5036[0]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2705(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2706(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 36;
            break;
         case 3:
            var10005 = 127;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
