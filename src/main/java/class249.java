import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public abstract class class249 extends class616 {
   @OriginalMember(
      owner = "client!tea",
      name = "I",
      descriptor = "S"
   )
   public short field3334;
   @OriginalMember(
      owner = "client!tea",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3344 = new String[]{method1887(method1886("\u0014{$Xy")), method1887(method1886("\u0001 f\u001a")), method1887(method1886("\u001b0kXB.}")), method1887(method1886("\u001b0kXIG")), method1887(method1886("\u001b0kX8\u0006;c\u0002:G")), method1887(method1886("\u001b0kXEG")), method1887(method1886("\u001b0kXGG")), method1887(method1886("\u001b0kXAG")), method1887(method1886("\u001b0kXF.}")), method1887(method1886("\u001b0kXC.}")), method1887(method1886("\u001b0kXQG")), method1887(method1886("\u001b0kXSG"))};
   @OriginalMember(
      owner = "client!tea",
      name = "B",
      descriptor = "[S"
   )
   private static short[] field3331 = new short[]{-1, -1, -1, -1, -1};
   @OriginalMember(
      owner = "client!tea",
      name = "K",
      descriptor = "[S"
   )
   private static short[] field3336 = new short[]{-1, -1, -1, -1, -1};
   @OriginalMember(
      owner = "client!tea",
      name = "y",
      descriptor = "[S"
   )
   private static short[] field3340 = new short[]{6798, 8741, 25238, 4626, 4550};
   @OriginalMember(
      owner = "client!tea",
      name = "z",
      descriptor = "[[S"
   )
   public static short[][] field3343 = new short[][]{field3340, field3336, field3331};
   @OriginalMember(
      owner = "client!tea",
      name = "D",
      descriptor = "Lpia;"
   )
   public static class102 field3339 = new class102("", 10);
   @OriginalMember(
      owner = "client!tea",
      name = "M",
      descriptor = "F"
   )
   public static float field3329;
   @OriginalMember(
      owner = "client!tea",
      name = "H",
      descriptor = "I"
   )
   public static int field3330;
   @OriginalMember(
      owner = "client!tea",
      name = "F",
      descriptor = "I"
   )
   public static int field3332;
   @OriginalMember(
      owner = "client!tea",
      name = "L",
      descriptor = "I"
   )
   public static int field3333;
   @OriginalMember(
      owner = "client!tea",
      name = "J",
      descriptor = "I"
   )
   public static int field3335;
   @OriginalMember(
      owner = "client!tea",
      name = "E",
      descriptor = "I"
   )
   public static int field3337;
   @OriginalMember(
      owner = "client!tea",
      name = "G",
      descriptor = "I"
   )
   public static int field3338;
   @OriginalMember(
      owner = "client!tea",
      name = "C",
      descriptor = "I"
   )
   public static int field3341;
   @OriginalMember(
      owner = "client!tea",
      name = "A",
      descriptor = "I"
   )
   public static int field3342;

   @OriginalMember(
      owner = "client!tea",
      name = "a",
      descriptor = "(IBLlw;II)V"
   )
   public static final void method1877(int param0, byte param1, class687 param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tea",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1878(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != -1) {
            field3339 = null;
         }

         ++field3330;
         return (2048 & arg1) != 0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field3344[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tea",
      name = "b",
      descriptor = "(III)Z"
   )
   public static final boolean method1879(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 14907) {
            method1884(-102, -106);
         }

         ++field3335;
         return class473.method3522(arg2, arg0, 0) | (arg0 & 262144) != 0 || class625.method4509(arg0, arg2, true);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field3344[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tea",
      name = "a",
      descriptor = "(BLha;)Z"
   )
   public final boolean method1880(byte arg0, class66 arg1) {
      try {
         ++field3341;
         return arg0 < 63 ? false : class499.method3722(super.field9003 >> class459.field6950, super.field9005, 118, super.field9007 >> class459.field6950);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field3344[5] + arg0 + ',' + (arg1 != null ? field3344[0] : field3344[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tea",
      name = "a",
      descriptor = "([Llja;I)I"
   )
   public final int method1881(class744[] arg0, int arg1) {
      try {
         if (arg1 != -52) {
            return 117;
         } else {
            ++field3342;
            return this.method4469(super.field9003 >> class459.field6950, arg0, super.field9007 >> class459.field6950, (byte)-5);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field3344[7] + (arg0 != null ? field3344[0] : field3344[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tea",
      name = "c",
      descriptor = "(III)Lega;"
   )
   public static final class739 method1882(int arg0, int arg1, int arg2) {
      try {
         ++field3338;
         class739 var3 = new class739();
         var3.field10961 = arg2 + 1 + 5;
         var3.field10963 = arg0 + arg1;
         var3.field10981 = -1;
         var3.field10962 = -1;
         var3.field10979 = new int[var3.field10961][var3.field10963];
         var3.method5387(3);
         return var3;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field3344[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tea",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method1883(boolean arg0) {
      try {
         if (arg0) {
            method1882(6, 5, 30);
         }

         ++field3333;
         return class569.field8487[(super.field9003 >> class459.field6950) + -class681.field10228 - -class488.field7212][(super.field9007 >> class459.field6950) + class488.field7212 + -class518.field7555];
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3344[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tea",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method1884(int arg0, int arg1) {
      try {
         class742.method5406((byte)41);
         if (arg1 != 9210) {
            field3339 = null;
         }

         ++field3332;
         int var2 = class748.field11092.method3539(arg0, -114).field2338;
         if (var2 != 0) {
            int var3 = class597.field8793.field1905[arg0];
            if (var2 == 6) {
               class489.field7228 = var3;
            }

            if (~var2 == -6) {
               class315.field4500 = var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field3344[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tea",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method1885(boolean arg0) {
      try {
         field3331 = null;
         field3343 = null;
         field3336 = null;
         field3340 = null;
         if (arg0) {
            field3331 = null;
         }

         field3339 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3344[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tea",
      name = "<init>",
      descriptor = "(IIIIII)V"
   )
   public class249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         super.field9007 = arg2;
         super.field9003 = arg0;
         super.field8998 = arg1;
         this.field3334 = (short)arg5;
         super.field9010 = (byte)arg3;
         super.field9005 = (byte)arg4;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field3344[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1886(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 4);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1887(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 111;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 4;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
