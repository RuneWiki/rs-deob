import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gja")
public class class53 {
   @OriginalMember(
      owner = "client!gja",
      name = "c",
      descriptor = "I"
   )
   public int field1090 = 64;
   @OriginalMember(
      owner = "client!gja",
      name = "l",
      descriptor = "Z"
   )
   public boolean field1088 = false;
   @OriginalMember(
      owner = "client!gja",
      name = "i",
      descriptor = "I"
   )
   public int field1095 = 64;
   @OriginalMember(
      owner = "client!gja",
      name = "e",
      descriptor = "I"
   )
   public int field1096 = 2;
   @OriginalMember(
      owner = "client!gja",
      name = "j",
      descriptor = "I"
   )
   public int field1097 = -1;
   @OriginalMember(
      owner = "client!gja",
      name = "d",
      descriptor = "Z"
   )
   public boolean field1094 = false;
   @OriginalMember(
      owner = "client!gja",
      name = "k",
      descriptor = "I"
   )
   public int field1092 = 1;
   @OriginalMember(
      owner = "client!gja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1101 = new String[]{method635(method634("\u000fc 7_@")), method635(method634("\u0006|-u")), method635(method634("\u0013'o7c")), method635(method634("\u000fc 7\\@")), method635(method634("\u000fc 7Z@")), method635(method634("\u000fc 7]@"))};
   @OriginalMember(
      owner = "client!gja",
      name = "g",
      descriptor = "Lgh;"
   )
   public static class572 field1089 = new class572(21, 2);
   @OriginalMember(
      owner = "client!gja",
      name = "a",
      descriptor = "I"
   )
   public static int field1091;
   @OriginalMember(
      owner = "client!gja",
      name = "m",
      descriptor = "I"
   )
   public static int field1093;
   @OriginalMember(
      owner = "client!gja",
      name = "f",
      descriptor = "I"
   )
   public static int field1098;
   @OriginalMember(
      owner = "client!gja",
      name = "h",
      descriptor = "I"
   )
   public static int field1100;
   @OriginalMember(
      owner = "client!gja",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field1099;

   @OriginalMember(
      owner = "client!gja",
      name = "a",
      descriptor = "(IIILuda;)V"
   )
   private final void method630(int arg0, int arg1, int arg2, class473 arg3) {
      try {
         if (arg1 != -6) {
            method631(-31);
         }

         ++field1091;
         if (arg2 == 1) {
            this.field1097 = arg3.method3565(true);
            if (~this.field1097 == -65536) {
               this.field1097 = -1;
               return;
            }
         } else {
            if (~arg2 == -3) {
               this.field1090 = arg3.method3565(true) - -1;
               this.field1095 = arg3.method3565(true) - -1;
               return;
            }

            if (arg2 == 3) {
               arg3.method3543(-1132613840);
               return;
            }

            if (~arg2 != -5) {
               if (~arg2 != -6) {
                  if (arg2 != 6) {
                     if (~arg2 == -8) {
                        this.field1094 = true;
                        return;
                     }
                  } else {
                     this.field1088 = true;
                  }

                  return;
               }

               this.field1092 = arg3.method3564((byte)-86);
               return;
            }

            this.field1096 = arg3.method3564((byte)-57);
         }

      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field1101[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1101[2] : field1101[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gja",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method631(int arg0) {
      try {
         if (arg0 == 0) {
            field1089 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1101[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gja",
      name = "a",
      descriptor = "(IIILpd;)J"
   )
   public static final long method632(int arg0, int arg1, int arg2, class268 arg3) {
      try {
         ++field1093;
         long var4 = 4194304L;
         long var6 = Long.MIN_VALUE;
         if (arg2 != 19737) {
            field1089 = null;
         }

         class670 var8 = class634.field9256.method2559(arg3.method591((byte)-30), arg2 + -19737);
         long var9 = (long)(1073741824 | arg0 << 7 | arg1 | arg3.method596(16202) << 14 | arg3.method587(true) << 20);
         if (var8.field9770 == 0) {
            var9 |= var6;
         }

         if (~var8.field9747 == -2) {
            var9 |= var4;
         }

         return var9 | (long)arg3.method591((byte)-79) << 32;
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field1101[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1101[2] : field1101[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gja",
      name = "a",
      descriptor = "(BILuda;)V"
   )
   public final void method633(byte arg0, int arg1, class473 arg2) {
      boolean var4 = client.field4564;

      try {
         while(true) {
            int var5 = arg2.method3564((byte)-67);
            if (var5 != 0) {
               this.method630(arg1, -6, var5, arg2);
               if (var4) {
                  break;
               }

               if (!var4) {
                  continue;
               }
            }

            ++field1098;
            break;
         }

         if (arg0 != 77) {
            this.field1095 = -57;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field1101[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1101[2] : field1101[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method634(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 30);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method635(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 30;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
