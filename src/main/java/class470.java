import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class470 extends class546 {
   @OriginalMember(
      owner = "client!os",
      name = "B",
      descriptor = "D"
   )
   public double field6518;
   @OriginalMember(
      owner = "client!os",
      name = "w",
      descriptor = "[[S"
   )
   public short[][] field6514;
   @OriginalMember(
      owner = "client!os",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6519 = new String[]{method3451(method3450("/0iL")), method3451(method3450(".6+f0")), method3451(method3450(":k+\u000ee")), method3451(method3450(".6+a0")), method3451(method3450(".6+\u001cq/,q\u001e0")), method3451(method3450(".6+b0")), method3451(method3450(".6+d0")), method3451(method3450(".6+c0")), method3451(method3450(".6+g0")), method3451(method3450(".6+e0"))};
   @OriginalMember(
      owner = "client!os",
      name = "C",
      descriptor = "[Ljava/awt/Color;"
   )
   public static Color[] field6510 = new Color[]{new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381)};
   @OriginalMember(
      owner = "client!os",
      name = "y",
      descriptor = "[I"
   )
   public static int[] field6517 = new int[8];
   @OriginalMember(
      owner = "client!os",
      name = "z",
      descriptor = "I"
   )
   public static int field6508;
   @OriginalMember(
      owner = "client!os",
      name = "D",
      descriptor = "I"
   )
   public static int field6509;
   @OriginalMember(
      owner = "client!os",
      name = "E",
      descriptor = "I"
   )
   public static int field6511;
   @OriginalMember(
      owner = "client!os",
      name = "v",
      descriptor = "I"
   )
   public static int field6512;
   @OriginalMember(
      owner = "client!os",
      name = "t",
      descriptor = "I"
   )
   public static int field6513;
   @OriginalMember(
      owner = "client!os",
      name = "u",
      descriptor = "I"
   )
   public static int field6515;
   @OriginalMember(
      owner = "client!os",
      name = "x",
      descriptor = "I"
   )
   public static int field6516;

   @OriginalMember(
      owner = "client!os",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method3443(byte arg0) {
      try {
         ++field6516;
         if (!class383.field5359) {
            class424.field5950 = true;
            class157.field2018 += (24.0F - class157.field2018) / 2.0F;
            if (arg0 <= -72) {
               class383.field5359 = true;
            }
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6519[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "c",
      descriptor = "(Z)V"
   )
   public static void method3444(boolean arg0) {
      try {
         field6517 = null;
         if (!arg0) {
            field6510 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6519[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(BLwm;)Lgw;"
   )
   public static final class181 method3445(byte arg0, class594 arg1) {
      try {
         ++field6513;
         if (arg0 < 68) {
            return null;
         } else {
            class498 var2 = class405.method3075(0, arg1);
            int var3 = arg1.method4333(-99);
            return new class181(var2.field1297, var2.field1309, var2.field1301, var2.field1302, var2.field1299, var2.field1311, var2.field1303, var2.field1298, var2.field1306, var2.field6859, var2.field6857, var2.field6851, var2.field6858, var2.field6852, var2.field6853, var3);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6519[1] + arg0 + ',' + (arg1 != null ? field6519[2] : field6519[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "b",
      descriptor = "(II)Ldg;"
   )
   public static final class436 method3446(int arg0, int arg1) {
      boolean var2 = client.field4273;

      try {
         ++field6515;
         class436[] var3 = class633.method4597((byte)-58);
         if (arg0 != -24577) {
            method3449(114, (byte)96, 57, -49, 20, -92);
         }

         int var4 = 0;
         if (!var2 && ~var3.length >= ~var4) {
            return null;
         } else {
            do {
               class436 var5 = var3[var4];
               if (~var5.field6058 == ~arg1) {
                  return var5;
               }

               ++var4;
            } while(~var3.length < ~var4);

            return null;
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field6519[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3447(int arg0, int arg1, int arg2) {
      try {
         ++field6511;
         if (arg0 != 8) {
            return true;
         } else {
            return ~(arg2 & 33) != -1;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6519[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method3448(int arg0) {
      try {
         ++field6509;
         if (arg0 != -166584224) {
            field6512 = -71;
         }

         return (long)(this.field6514.length << 0 | this.field6514[0].length);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6519[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(IBIIII)V"
   )
   public static final void method3449(int param0, byte param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!os",
      name = "<init>",
      descriptor = "([[SD)V"
   )
   public class470(short[][] arg0, double arg1) {
      try {
         this.field6518 = arg1;
         this.field6514 = arg0;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6519[4] + (arg0 != null ? field6519[2] : field6519[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3450(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!os",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3451(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 69;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
