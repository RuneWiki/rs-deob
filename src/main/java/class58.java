import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class58 {
   @OriginalMember(
      owner = "client!cb",
      name = "j",
      descriptor = "Z"
   )
   public boolean field711 = true;
   @OriginalMember(
      owner = "client!cb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field723 = new String[]{method435(method434("gGA\u0019d")), method435(method434("jP\u00031")), method435(method434("\u007f\u000bAs1")), method435(method434("gGA\u0018d")), method435(method434("gGA\u001fd")), method435(method434("gGA\u001cd")), method435(method434("gGA\u001ed"))};
   @OriginalMember(
      owner = "client!cb",
      name = "i",
      descriptor = "Lgea;"
   )
   public static class750 field712 = new class750();
   @OriginalMember(
      owner = "client!cb",
      name = "k",
      descriptor = "I"
   )
   public static int field720 = 0;
   @OriginalMember(
      owner = "client!cb",
      name = "c",
      descriptor = "Luk;"
   )
   public static class498 field718 = new class498(133, 6);
   @OriginalMember(
      owner = "client!cb",
      name = "d",
      descriptor = "Llj;"
   )
   public static class304 field722 = new class304(8);
   @OriginalMember(
      owner = "client!cb",
      name = "b",
      descriptor = "C"
   )
   private char field713;
   @OriginalMember(
      owner = "client!cb",
      name = "f",
      descriptor = "I"
   )
   public int field710;
   @OriginalMember(
      owner = "client!cb",
      name = "e",
      descriptor = "I"
   )
   public static int field714;
   @OriginalMember(
      owner = "client!cb",
      name = "l",
      descriptor = "I"
   )
   public static int field715;
   @OriginalMember(
      owner = "client!cb",
      name = "m",
      descriptor = "I"
   )
   public static int field716;
   @OriginalMember(
      owner = "client!cb",
      name = "h",
      descriptor = "I"
   )
   public static int field719;
   @OriginalMember(
      owner = "client!cb",
      name = "g",
      descriptor = "I"
   )
   public static int field721;
   @OriginalMember(
      owner = "client!cb",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public String field717;

   @OriginalMember(
      owner = "client!cb",
      name = "a",
      descriptor = "(Lica;I)V",
      line = 13
   )
   public final void method429(class354 arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         if (arg1 > -115) {
            method431(116, 125, 117, 22, 108, 100, -80);
         }

         while(true) {
            int var4 = arg0.method2855(-31007);
            if (~var4 != -1) {
               this.method433(var4, arg0, (byte)-87);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field715;
            break;
         }

      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field723[0] + (arg0 != null ? field723[2] : field723[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cb",
      name = "a",
      descriptor = "(I)V",
      line = 34
   )
   public static void method430(int arg0) {
      try {
         field718 = null;
         int var1 = -90 / ((4 - arg0) / 41);
         field722 = null;
         field712 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field723[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cb",
      name = "a",
      descriptor = "(IIIIIII)V",
      line = 54
   )
   public static final void method431(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cb",
      name = "b",
      descriptor = "(I)Z",
      line = 187
   )
   public final boolean method432(int arg0) {
      try {
         if (arg0 != 115) {
            method431(-34, 66, -33, -53, 104, -81, 57);
         }

         ++field721;
         return this.field713 == 's';
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field723[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cb",
      name = "a",
      descriptor = "(ILica;B)V",
      line = 204
   )
   private final void method433(int arg0, class354 arg1, byte arg2) {
      boolean var4 = client.field1786;

      try {
         if (arg2 > -43) {
            this.field711 = false;
         }

         label52: {
            if (arg0 == 1) {
               this.field713 = class424.method3361((byte)115, arg1.method2886((byte)88));
               if (!var4) {
                  break label52;
               }
            }

            if (arg0 == 2) {
               this.field710 = arg1.method2894(126);
               if (!var4) {
                  break label52;
               }
            }

            if (arg0 == 4) {
               this.field711 = false;
               if (!var4) {
                  break label52;
               }
            }

            if (~arg0 == -6) {
               this.field717 = arg1.method2843(-1);
            }
         }

         ++field716;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field723[3] + arg0 + ',' + (arg1 != null ? field723[2] : field723[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method434(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method435(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 37;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
