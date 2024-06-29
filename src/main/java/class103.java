import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class103 extends class325 implements class11 {
   @OriginalMember(
      owner = "client!pw",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1338 = new String[]{method922(method921("r\n9[>")), method922(method921("r\n9T>")), method922(method921("r\n9W>")), method922(method921("r\n9X>")), method922(method921("r\n9U>")), method922(method921("yS9?k")), method922(method921("r\n9Y>")), method922(method921("l\b{}")), method922(method921("r\n9S>")), method922(method921("r\n9P>")), method922(method921("r\n9V>"))};
   @OriginalMember(
      owner = "client!pw",
      name = "E",
      descriptor = "I"
   )
   public static int field1334 = 0;
   @OriginalMember(
      owner = "client!pw",
      name = "v",
      descriptor = "Liba;"
   )
   public static class237 field1329 = new class237();
   @OriginalMember(
      owner = "client!pw",
      name = "x",
      descriptor = "B"
   )
   private byte field1330;
   @OriginalMember(
      owner = "client!pw",
      name = "A",
      descriptor = "F"
   )
   public static float field1328;
   @OriginalMember(
      owner = "client!pw",
      name = "F",
      descriptor = "I"
   )
   public static int field1326;
   @OriginalMember(
      owner = "client!pw",
      name = "D",
      descriptor = "I"
   )
   public static int field1327;
   @OriginalMember(
      owner = "client!pw",
      name = "B",
      descriptor = "I"
   )
   public static int field1331;
   @OriginalMember(
      owner = "client!pw",
      name = "u",
      descriptor = "I"
   )
   public static int field1332;
   @OriginalMember(
      owner = "client!pw",
      name = "y",
      descriptor = "I"
   )
   public static int field1333;
   @OriginalMember(
      owner = "client!pw",
      name = "w",
      descriptor = "I"
   )
   public static int field1335;
   @OriginalMember(
      owner = "client!pw",
      name = "C",
      descriptor = "I"
   )
   public static int field1336;
   @OriginalMember(
      owner = "client!pw",
      name = "z",
      descriptor = "I"
   )
   public static int field1337;

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(BZ)Ljaclib/memory/Buffer;"
   )
   public final Buffer method102(byte arg0, boolean arg1) {
      try {
         if (arg0 > -35) {
            field1328 = -0.49538437F;
         }

         ++field1335;
         return super.method2551(-1, super.field4460.field8513, arg1);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1338[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method917(int arg0) {
      try {
         ++field1333;
         if (arg0 < 85) {
            this.field1330 = -12;
         }

         return super.method917(126);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1338[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method105(int arg0) {
      try {
         ++field1331;
         super.method105(-97);
         if (arg0 > -89) {
            method920(-16);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1338[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method918(int arg0) {
      try {
         field1329 = null;
         if (arg0 != 0) {
            field1329 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1338[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(ILjaclib/memory/Source;IB)Z"
   )
   public final boolean method103(int arg0, Source arg1, int arg2, byte arg3) {
      try {
         this.field1330 = (byte)arg2;
         ++field1337;
         super.method2553(arg0, arg1, (byte)76);
         int var5 = -31 / ((arg3 - 20) / 35);
         return true;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field1338[6] + arg0 + ',' + (arg1 != null ? field1338[5] : field1338[7]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method919(byte arg0) {
      try {
         ++field1336;
         return arg0 < 17 ? -108 : this.field1330;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1338[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "<init>",
      descriptor = "(Llea;Z)V"
   )
   public class103(class574 arg0, boolean arg1) {
      super(arg0, 34962, arg1);
   }

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method104(int arg0) {
      try {
         if (arg0 != -19749) {
            return true;
         } else {
            ++field1332;
            return super.method2554(true, super.field4460.field8513);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1338[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(III)Z"
   )
   public final boolean method101(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != 30842) {
            return false;
         } else {
            this.field1330 = (byte)arg2;
            ++field1326;
            super.method1192(arg0 + -30935, arg1);
            return true;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1338[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "f",
      descriptor = "(I)Lhia;"
   )
   public static final class49 method920(int arg0) {
      try {
         ++field1327;
         return arg0 != 1 ? null : class367.method2900(1, -122);
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1338[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method921(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method922(char[] arg0) {
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
            var10005 = 125;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 17;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
