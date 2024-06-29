import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public class class545 {
   @OriginalMember(
      owner = "client!hha",
      name = "g",
      descriptor = "[I"
   )
   public int[] field8097;
   @OriginalMember(
      owner = "client!hha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8105 = new String[]{method4044(method4043("d\u0019j\t\u0013$")), method4044(method4043("b\u0004gK")), method4044(method4043("w_%\t-")), method4044(method4043("d\u0019j\tle\u001fbSn$")), method4044(method4043("d\u0019j\t\u0011$")), method4044(method4043("d\u0019j\t\u0012$"))};
   @OriginalMember(
      owner = "client!hha",
      name = "b",
      descriptor = "Lsda;"
   )
   public static class269 field8098 = new class269(24, 3);
   @OriginalMember(
      owner = "client!hha",
      name = "h",
      descriptor = "I"
   )
   public static int field8100 = 0;
   @OriginalMember(
      owner = "client!hha",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field8101 = new int[1];
   @OriginalMember(
      owner = "client!hha",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field8104 = new int[]{1, 2, 4, 8};
   @OriginalMember(
      owner = "client!hha",
      name = "a",
      descriptor = "F"
   )
   public static float field8099;
   @OriginalMember(
      owner = "client!hha",
      name = "c",
      descriptor = "I"
   )
   public static int field8102;
   @OriginalMember(
      owner = "client!hha",
      name = "e",
      descriptor = "I"
   )
   public static int field8103;

   @OriginalMember(
      owner = "client!hha",
      name = "a",
      descriptor = "(Ljj;I)V",
      line = 6
   )
   private final void method4040(class128 arg0, int arg1) {
      int var3 = client.field4530;

      try {
         label60:
         while(true) {
            int var4 = arg0.method1104(255);
            if (~var4 != -1) {
               if (var4 != 1) {
                  continue;
               }

               int var5 = arg0.method1104(255);
               this.field8097 = new int[var5];
               int var6 = 0;
               if (var3 != 0) {
                  break;
               }

               if (var3 != 0) {
                  this.field8097[var6] = arg0.method1104(255);
                  ++var6;
               }

               while(true) {
                  while(~var6 > ~this.field8097.length) {
                     this.field8097[var6] = arg0.method1104(255);
                     ++var6;
                  }

                  if (var3 == 0) {
                     if (var3 == 0) {
                        continue label60;
                     }
                     break;
                  }

                  ++var6;
               }
            }

            if (arg1 > -9) {
               field8104 = null;
            }

            ++field8102;
            break;
         }

      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field8105[4] + (arg0 != null ? field8105[2] : field8105[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hha",
      name = "a",
      descriptor = "(I)V",
      line = 64
   )
   public static void method4041(int arg0) {
      try {
         field8104 = null;
         field8098 = null;
         field8101 = null;
         if (arg0 != 4) {
            method4041(-26);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8105[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hha",
      name = "<init>",
      descriptor = "(Leaa;)V",
      line = 81
   )
   public class545(class526 arg0) {
      try {
         byte[] var2 = arg0.method3888((byte)40, 6);
         this.method4040(new class128(var2), -61);
         if (this.field8097 == null) {
            throw new RuntimeException("");
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8105[3] + (arg0 != null ? field8105[2] : field8105[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hha",
      name = "<init>",
      descriptor = "()V",
      line = 97
   )
   protected class545() {
      try {
         this.field8097 = new int[0];
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8105[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!hha",
      name = "a",
      descriptor = "(III)Z",
      line = 105
   )
   public static final boolean method4042(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != -32050) {
            method4042(14, 118, -118);
         }

         ++field8103;
         return (arg0 & 2048) != 0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8105[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4043(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4044(char[] arg0) {
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
            var10005 = 113;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
