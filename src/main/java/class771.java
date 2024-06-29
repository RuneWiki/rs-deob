import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class771 extends class66 {
   @OriginalMember(
      owner = "client!vt",
      name = "Nb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11228 = new String[]{method5564(method5563("%\u001a\u0017\u0013&")), method5564(method5563("(@\u0017~s")), method5564(method5563("%\u001a\u0017\u0014&")), method5564(method5563("=\u001bU<")), method5564(method5563("%\u001a\u0017\u0011&")), method5564(method5563("%\u001a\u0017\u0015&")), method5564(method5563("%\u001a\u0017\u0012&"))};
   @OriginalMember(
      owner = "client!vt",
      name = "Mb",
      descriptor = "I"
   )
   public static int field11222 = 0;
   @OriginalMember(
      owner = "client!vt",
      name = "Kb",
      descriptor = "[I"
   )
   public static int[] field11227 = new int[25];
   @OriginalMember(
      owner = "client!vt",
      name = "Jb",
      descriptor = "I"
   )
   public static int field11223;
   @OriginalMember(
      owner = "client!vt",
      name = "Lb",
      descriptor = "I"
   )
   public static int field11224;
   @OriginalMember(
      owner = "client!vt",
      name = "Hb",
      descriptor = "I"
   )
   public static int field11225;
   @OriginalMember(
      owner = "client!vt",
      name = "Ib",
      descriptor = "I"
   )
   public static int field11226;

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(FI)V"
   )
   public final void method5558(float arg0, int arg1) {
      try {
         ++field11225;
         int var3 = Stream.floatToRawIntBits(arg0);
         super.field859[super.field864++] = (byte)(var3 >> 24);
         super.field859[super.field864++] = (byte)(var3 >> 16);
         if (arg1 == 8511) {
            super.field859[super.field864++] = (byte)(var3 >> 8);
            super.field859[super.field864++] = (byte)var3;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field11228[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method5559(int arg0, int arg1, int arg2) {
      boolean var3 = client.field1481;

      try {
         ++field11226;
         if (arg1 >= -43) {
            field11222 = 64;
         }

         if (~arg0 == 1) {
            return 12345678;
         } else if (arg0 == -1) {
            if (~arg2 <= -3) {
               if (arg2 <= 126) {
                  return arg2;
               }

               arg2 = 126;
               if (!var3) {
                  return arg2;
               }
            }

            arg2 = 2;
            return arg2;
         } else {
            arg2 = (127 & arg0) * arg2 >> 7;
            if (arg2 >= 2) {
               if (~arg2 >= -127) {
                  return (arg0 & 65408) + arg2;
               }

               arg2 = 126;
               if (!var3) {
                  return (arg0 & 65408) + arg2;
               }
            }

            arg2 = 2;
            return (arg0 & 65408) + arg2;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field11228[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "b",
      descriptor = "(FI)V"
   )
   public final void method5560(float arg0, int arg1) {
      try {
         ++field11223;
         int var3 = Stream.floatToRawIntBits(arg0);
         super.field859[super.field864++] = (byte)var3;
         super.field859[super.field864++] = (byte)(var3 >> 8);
         super.field859[super.field864++] = (byte)(var3 >> 16);
         if (arg1 == 636827368) {
            super.field859[super.field864++] = (byte)(var3 >> 24);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field11228[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "([SII)[S"
   )
   public static final short[] method5561(short[] arg0, int arg1, int arg2) {
      try {
         ++field11224;
         short[] var3 = new short[arg1];
         class349.method2757(arg0, 0, var3, 0, arg1);
         if (arg2 != 1) {
            method5562(-61);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field11228[2] + (arg0 != null ? field11228[1] : field11228[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "w",
      descriptor = "(I)V"
   )
   public static void method5562(int arg0) {
      try {
         field11227 = null;
         if (arg0 != -1) {
            method5559(40, 36, -105);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11228[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class771(int arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!vt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5563(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5564(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
