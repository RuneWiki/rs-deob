import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class168 extends class393 {
   @OriginalMember(
      owner = "client!bs",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2202 = new String[]{method1466(method1465("\u0004.\u007fAw")), method1466(method1465("\u0004.\u007f@w")), method1466(method1465("\u0004.\u007fCw")), method1466(method1465("\u0004.\u007fOw")), method1466(method1465("\u0004.\u007fMw")), method1466(method1465("\u001ds\u007f*\"")), method1466(method1465("\b(=h")), method1466(method1465("\u0004.\u007fJw")), method1466(method1465("\u0004.\u007fGw")), method1466(method1465("\u0004.\u007fNw"))};
   @OriginalMember(
      owner = "client!bs",
      name = "s",
      descriptor = "I"
   )
   public static int field2192;
   @OriginalMember(
      owner = "client!bs",
      name = "r",
      descriptor = "I"
   )
   public static int field2193;
   @OriginalMember(
      owner = "client!bs",
      name = "l",
      descriptor = "I"
   )
   public static int field2194;
   @OriginalMember(
      owner = "client!bs",
      name = "q",
      descriptor = "I"
   )
   public static int field2195;
   @OriginalMember(
      owner = "client!bs",
      name = "n",
      descriptor = "I"
   )
   public static int field2197;
   @OriginalMember(
      owner = "client!bs",
      name = "o",
      descriptor = "I"
   )
   public static int field2198;
   @OriginalMember(
      owner = "client!bs",
      name = "m",
      descriptor = "I"
   )
   public static int field2199;
   @OriginalMember(
      owner = "client!bs",
      name = "j",
      descriptor = "I"
   )
   public static int field2200;
   @OriginalMember(
      owner = "client!bs",
      name = "p",
      descriptor = "I"
   )
   public static int field2201;
   @OriginalMember(
      owner = "client!bs",
      name = "k",
      descriptor = "Lww;"
   )
   public static class339 field2196;

   @OriginalMember(
      owner = "client!bs",
      name = "<init>",
      descriptor = "(Lfm;)V"
   )
   public class168(class281 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!bs",
      name = "d",
      descriptor = "(B)V"
   )
   public final void method1457(byte arg0) {
      try {
         ++field2197;
         super.field5438.method2263(false, 0);
         int var2 = -85 % ((22 - arg0) / 63);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2202[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bs",
      name = "a",
      descriptor = "(IIILjava/lang/Object;)[B"
   )
   public static final byte[] method1458(int arg0, int arg1, int arg2, Object arg3) {
      try {
         if (arg0 != -25820) {
            return null;
         } else {
            ++field2193;
            if (arg3 == null) {
               return null;
            } else if (arg3 instanceof byte[]) {
               byte[] var4 = (byte[])arg3;
               return class293.method2357(arg1, arg2, var4, -108);
            } else if (arg3 instanceof class413) {
               class413 var5 = (class413)arg3;
               return var5.method527((byte)111, arg2, arg1);
            } else {
               throw new IllegalArgumentException();
            }
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field2202[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2202[5] : field2202[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bs",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method1459(boolean arg0, byte arg1) {
      try {
         if (arg1 != 32) {
            this.method1457((byte)-65);
         }

         super.field5438.method2263(true, 0);
         ++field2200;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2202[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bs",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method1460(boolean arg0) {
      try {
         ++field2192;
         if (arg0) {
            field2194 = 74;
         }

         return true;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2202[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bs",
      name = "a",
      descriptor = "(Lvba;II)V"
   )
   public final void method1461(class421 arg0, int arg1, int arg2) {
      try {
         super.field5438.method2265(arg0, (byte)-71);
         if (arg1 >= 84) {
            ++field2201;
            super.field5438.method2240(-4, arg2);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field2202[9] + (arg0 != null ? field2202[5] : field2202[6]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bs",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1462(int arg0, int arg1, int arg2) {
      try {
         if (arg1 == 7313) {
            ++field2199;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field2202[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bs",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1463(int arg0) {
      try {
         field2196 = null;
         if (arg0 != -12857) {
            field2195 = -86;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2202[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bs",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method1464(int arg0, boolean arg1) {
      try {
         if (arg0 != 29404) {
            field2196 = null;
         }

         ++field2198;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2202[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1465(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 95);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1466(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 93;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 95;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
