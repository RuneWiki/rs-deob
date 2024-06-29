import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public abstract class class743 {
   @OriginalMember(
      owner = "client!nea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11024 = new String[]{method5416(method5415("\u0013Ia\r")), method5416(method5415("\u0013YlOrU")), method5416(method5415("\u0006\u0012#OK")), method5416(method5415("\u0013YlOwU")), method5416(method5415("\u0013YlOtU")), method5416(method5415("\u0013YlOuU"))};
   @OriginalMember(
      owner = "client!nea",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field11017 = new int[1];
   @OriginalMember(
      owner = "client!nea",
      name = "a",
      descriptor = "I"
   )
   public static int field11019 = 0;
   @OriginalMember(
      owner = "client!nea",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field11023 = new int[8];
   @OriginalMember(
      owner = "client!nea",
      name = "g",
      descriptor = "F"
   )
   public static float field11020;
   @OriginalMember(
      owner = "client!nea",
      name = "h",
      descriptor = "I"
   )
   public static int field11016;
   @OriginalMember(
      owner = "client!nea",
      name = "d",
      descriptor = "I"
   )
   public static int field11018;
   @OriginalMember(
      owner = "client!nea",
      name = "c",
      descriptor = "I"
   )
   public static int field11021;
   @OriginalMember(
      owner = "client!nea",
      name = "e",
      descriptor = "I"
   )
   public static int field11022;

   @OriginalMember(
      owner = "client!nea",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method5410(int arg0) {
      try {
         if (arg0 == 1) {
            ++field11016;
            class749.method5463((byte)-31);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11024[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nea",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5411(byte arg0) {
      try {
         field11017 = null;
         field11023 = null;
         int var1 = -98 % ((-61 - arg0) / 63);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11024[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nea",
      name = "a",
      descriptor = "(I[Ljava/lang/String;[S)V"
   )
   public static final void method5412(int arg0, String[] arg1, short[] arg2) {
      try {
         class78.method743(arg1.length - 1, arg2, (byte)72, 0, arg1);
         ++field11021;
         int var3 = -120 % ((48 - arg0) / 54);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field11024[5] + arg0 + ',' + (arg1 != null ? field11024[2] : field11024[0]) + ',' + (arg2 != null ? field11024[2] : field11024[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nea",
      name = "a",
      descriptor = "(ILjj;)V"
   )
   public static final void method5413(int arg0, class128 arg1) {
      int var2 = client.field4530;

      try {
         ++field11018;
         int var3 = arg1.method1061((byte)60);
         class193.field2426 = new class224[var3];
         int var4 = 0;
         if (var2 != 0) {
            class193.field2426[var4] = new class224();
            class193.field2426[var4].field2868 = arg1.method1061((byte)60);
            class193.field2426[var4].field2869 = arg1.method1049((byte)-117);
            ++var4;
         }

         while(true) {
            while(~var4 > ~var3) {
               class193.field2426[var4] = new class224();
               class193.field2426[var4].field2868 = arg1.method1061((byte)60);
               class193.field2426[var4].field2869 = arg1.method1049((byte)-117);
               ++var4;
            }

            class498.field7379 = arg1.method1061((byte)60);
            class554.field8212 = arg1.method1061((byte)60);
            class458.field6936 = arg1.method1061((byte)60);
            class67.field841 = new class21[-class498.field7379 + 1 + class554.field8212];
            int var5 = 0;
            if (var2 == 0) {
               int var10000;
               if (var2 != 0) {
                  var10000 = arg1.method1061((byte)60);
               } else if (~class458.field6936 >= ~var5) {
                  var10000 = arg0;
                  if (var2 == 0) {
                     if (arg0 != 8) {
                        field11019 = 118;
                     }

                     class46.field532 = arg1.method1041(4758);
                     class78.field973 = true;
                     return;
                  }
               } else {
                  var10000 = arg1.method1061((byte)60);
               }

               while(true) {
                  int var6 = var10000;
                  class21 var7 = class67.field841[var6] = new class21();
                  var7.field11154 = arg1.method1104(255);
                  var7.field11149 = arg1.method1041(4758);
                  var7.field227 = var6 - -class498.field7379;
                  var7.field229 = arg1.method1049((byte)120);
                  var7.field226 = arg1.method1049((byte)98);
                  ++var5;
                  if (~class458.field6936 >= ~var5) {
                     var10000 = arg0;
                     if (var2 == 0) {
                        if (arg0 != 8) {
                           field11019 = 118;
                        }

                        class46.field532 = arg1.method1041(4758);
                        class78.field973 = true;
                        return;
                     }
                  } else {
                     var10000 = arg1.method1061((byte)60);
                  }
               }
            }

            ++var4;
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field11024[1] + arg0 + ',' + (arg1 != null ? field11024[2] : field11024[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nea",
      name = "a",
      descriptor = "(BLuu;)Luu;"
   )
   public abstract class300 method5414(byte arg0, class300 arg1);

   @OriginalMember(
      owner = "client!nea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5415(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5416(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 13;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
