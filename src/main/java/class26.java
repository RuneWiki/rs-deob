import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class26 {
   @OriginalMember(
      owner = "client!nc",
      name = "d",
      descriptor = "I"
   )
   public int field333;
   @OriginalMember(
      owner = "client!nc",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public String field334;
   @OriginalMember(
      owner = "client!nc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field335 = new String[]{method225(method224("\u007fYe7L")), method225(method224("\u007fO'\u0019")), method225(method224("\u007fYeI\r\u007fS?KL")), method225(method224("j\u0014e[\u0019")), method225(method224("\u007fYe1L")), method225(method224("\u007fYe4L")), method225(method224("\u007fYe6L")), method225(method224("\u007fYe\u0001\u000bBN9\u001c\nv\u0012"))};
   @OriginalMember(
      owner = "client!nc",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field332 = new int[4];
   @OriginalMember(
      owner = "client!nc",
      name = "h",
      descriptor = "I"
   )
   public static int field327;
   @OriginalMember(
      owner = "client!nc",
      name = "b",
      descriptor = "I"
   )
   public static int field328;
   @OriginalMember(
      owner = "client!nc",
      name = "f",
      descriptor = "I"
   )
   public static int field329;
   @OriginalMember(
      owner = "client!nc",
      name = "c",
      descriptor = "I"
   )
   public static int field330;
   @OriginalMember(
      owner = "client!nc",
      name = "e",
      descriptor = "I"
   )
   public static int field331;

   @OriginalMember(
      owner = "client!nc",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method220(int arg0) {
      boolean var1 = client.field4273;

      try {
         ++field330;
         int var2 = class261.field3357;
         int[] var3 = class294.field3862;
         int var4 = 0;
         class404 var5;
         if (var1) {
            var5 = class136.field1773[var3[var4]];
            if (var5 != null && var5.field7767 > 0) {
               --var5.field7767;
               if (var5.field7767 == 0) {
                  var5.field7778 = null;
               }
            }

            ++var4;
         }

         while(var4 < var2) {
            var5 = class136.field1773[var3[var4]];
            if (var5 != null && var5.field7767 > 0) {
               --var5.field7767;
               if (var5.field7767 == 0) {
                  var5.field7778 = null;
               }
            }

            ++var4;
         }

         if (arg0 < 5) {
            field332 = null;
         }

         int var6 = 0;
         if (var1 || var6 < class741.field10800) {
            do {
               long var7 = (long)class285.field3785[var6];
               class243 var9 = (class243)class335.field4808.method1839(-111, var7);
               if (var9 != null) {
                  class680 var10 = var9.field3043;
                  if (~var10.field7767 < -1) {
                     --var10.field7767;
                     if (~var10.field7767 == -1) {
                        var10.field7778 = null;
                     }
                  }
               }

               ++var6;
            } while(var6 < class741.field10800);

         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field335[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method221(int arg0) {
      try {
         field332 = null;
         if (arg0 != 1) {
            method223(104, 103, -83, (byte)33, 125);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field335[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method222(int arg0) {
      try {
         ++field329;
         class674.field9907.method4407(class674.field9907.field8444, -2160, 1);
         class674.field9907.method4407(class674.field9907.field8458, -2160, 1);
         class674.field9907.method4407(class674.field9907.field8427, -2160, 2);
         class674.field9907.method4407(class674.field9907.field8421, -2160, 2);
         class674.field9907.method4407(class674.field9907.field8424, -2160, 1);
         class674.field9907.method4407(class674.field9907.field8461, -2160, 1);
         class674.field9907.method4407(class674.field9907.field8423, -2160, arg0);
         class674.field9907.method4407(class674.field9907.field8445, -2160, 1);
         class674.field9907.method4407(class674.field9907.field8443, -2160, 1);
         class674.field9907.method4407(class674.field9907.field8447, -2160, 1);
         class674.field9907.method4407(class674.field9907.field8448, -2160, 1);
         class674.field9907.method4407(class674.field9907.field8457, -2160, 1);
         class674.field9907.method4407(class674.field9907.field8450, arg0 ^ -2159, 0);
         class674.field9907.method4407(class674.field9907.field8436, -2160, 1);
         class674.field9907.method4407(class674.field9907.field8468, -2160, 0);
         class674.field9907.method4407(class674.field9907.field8429, -2160, 0);
         class674.field9907.method4407(class674.field9907.field8430, -2160, 1);
         class674.field9907.method4407(class674.field9907.field8435, -2160, 0);
         class674.field9907.method4407(class674.field9907.field8469, -2160, 0);
         class721.method5244(11336);
         class674.field9907.method4407(class674.field9907.field8437, -2160, 1);
         class674.field9907.method4407(class674.field9907.field8440, -2160, 3);
         class493.method3579((byte)-115);
         class300.method2261(15966);
         class343.field4915 = true;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field335[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field327;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field335[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "a",
      descriptor = "(IIIBI)I"
   )
   public static final int method223(int arg0, int arg1, int arg2, byte arg3, int arg4) {
      try {
         ++field328;
         if (arg3 > -76) {
            return -85;
         } else {
            int var5 = 65536 - class192.field2341[arg1 * 8192 / arg2] >> 1;
            return ((-var5 + 65536) * arg4 >> 16) + (arg0 * var5 >> 16);
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field335[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V"
   )
   public class26(String arg0, String arg1, int arg2) {
      try {
         this.field333 = arg2;
         this.field334 = arg0;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field335[2] + (arg0 != null ? field335[3] : field335[1]) + ',' + (arg1 != null ? field335[3] : field335[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method224(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method225(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 58;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
