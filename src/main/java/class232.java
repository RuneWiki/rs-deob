import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class232 extends class213 {
   @OriginalMember(
      owner = "client!hm",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2884 = new String[]{method1759(method1758("jTs9\u000b")), method1759(method1758("jTs2\u000b")), method1759(method1758("y\u0017sV^")), method1759(method1758("lL1\u0014")), method1759(method1758("jTs?\u000b")), method1759(method1758("jTs;\u000b")), method1759(method1758("jTs:\u000b"))};
   @OriginalMember(
      owner = "client!hm",
      name = "H",
      descriptor = "Lbga;"
   )
   public static class378 field2882 = new class378(45, -2);
   @OriginalMember(
      owner = "client!hm",
      name = "D",
      descriptor = "I"
   )
   public static int field2878;
   @OriginalMember(
      owner = "client!hm",
      name = "E",
      descriptor = "I"
   )
   public static int field2879;
   @OriginalMember(
      owner = "client!hm",
      name = "G",
      descriptor = "I"
   )
   public static int field2880;
   @OriginalMember(
      owner = "client!hm",
      name = "I",
      descriptor = "I"
   )
   public static int field2881;
   @OriginalMember(
      owner = "client!hm",
      name = "F",
      descriptor = "I"
   )
   public static int field2883;

   @OriginalMember(
      owner = "client!hm",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      try {
         if (~arg2 == -1) {
            super.field2645 = ~arg0.method4288((byte)100) == -2;
         }

         ++field2879;
         int var4 = -116 / ((68 - arg1) / 48);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field2884[4] + (arg0 != null ? field2884[2] : field2884[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "a",
      descriptor = "(CIB)I"
   )
   public static final int method1756(char arg0, int arg1, byte arg2) {
      try {
         ++field2880;
         int var3 = arg0 << 4;
         if (arg2 != -2) {
            return 38;
         } else {
            if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
               char var6 = Character.toLowerCase(arg0);
               var3 = (var6 << 4) + 1;
            }

            return var3;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2884[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method1757(byte arg0) {
      try {
         if (arg0 == -114) {
            field2882 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2884[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public final int[][] method212(int arg0, byte arg1) {
      boolean var3 = client.field4273;

      try {
         ++field2878;
         int[][] var4 = super.field2644.method3543(-2, arg0);
         if (arg1 <= 26) {
            field2882 = null;
         }

         if (super.field2644.field6719) {
            int[][] var5 = this.method1615(true, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int var12 = 0;
            if (var3 || class576.field7916 > var12) {
               do {
                  var9[var12] = 4096 - var6[var12];
                  var10[var12] = -var7[var12] + 4096;
                  var11[var12] = 4096 - var8[var12];
                  ++var12;
               } while(class576.field7916 > var12);
            }
         }

         return var4;
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field2884[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "<init>",
      descriptor = "()V"
   )
   public class232() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!hm",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method215(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field2883;
         int[] var4 = super.field2650.method3769(arg0, -4);
         if (arg1 != 2064866508) {
            field2882 = null;
         }

         if (super.field2650.field7140) {
            int[] var5 = this.method1619((byte)69, arg0, 0);
            int var6 = 0;
            if (var3 || class576.field7916 > var6) {
               do {
                  var4[var6] = 4096 - var5[var6];
                  ++var6;
               } while(class576.field7916 > var6);
            }
         }

         return var4;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field2884[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1758(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 35);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1759(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 2;
            break;
         case 1:
            var10005 = 57;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 35;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
