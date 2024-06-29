import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class312 extends class4 {
   @OriginalMember(
      owner = "client!tf",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4284 = new String[]{method2309(method2308("WI0\u0000_")), method2309(method2308("WI0\u0007_")), method2309(method2308("\u0003_l*\u0001JK{!")), method2309(method2308("m@pe\u0014S\u001e,pE\u0003Lv$\u0005BLj \u0005\u0003\u001ff")), method2309(method2308("WI0\u0004_")), method2309(method2308("MZr)")), method2309(method2308("WI0\u0006_")), method2309(method2308("X\u00010k\n")), method2309(method2308("WI0\u0001_"))};
   @OriginalMember(
      owner = "client!tf",
      name = "G",
      descriptor = "I"
   )
   public static int field4279;
   @OriginalMember(
      owner = "client!tf",
      name = "F",
      descriptor = "I"
   )
   public static int field4280;
   @OriginalMember(
      owner = "client!tf",
      name = "E",
      descriptor = "I"
   )
   public static int field4281;
   @OriginalMember(
      owner = "client!tf",
      name = "I",
      descriptor = "I"
   )
   public static int field4282;
   @OriginalMember(
      owner = "client!tf",
      name = "H",
      descriptor = "I"
   )
   public static int field4283;
   @OriginalMember(
      owner = "client!tf",
      name = "J",
      descriptor = "[B"
   )
   private byte[] field4278;

   @OriginalMember(
      owner = "client!tf",
      name = "a",
      descriptor = "(BLjava/lang/String;)J",
      line = 5
   )
   public static final long method2304(byte arg0, String arg1) {
      boolean var2 = client.field4360;

      try {
         ++field4280;
         if (arg0 != -86) {
            return 44L;
         } else {
            int var3 = arg1.length();
            long var4 = 0L;
            int var6 = 0;
            if (var2) {
               var4 = (var4 << 5) - (var4 - (long)arg1.charAt(var6));
               ++var6;
            }

            while(true) {
               while(~var3 < ~var6) {
                  var4 = (var4 << 5) - (var4 - (long)arg1.charAt(var6));
                  ++var6;
               }

               if (!var2) {
                  return var4;
               }

               var4 = var4;
               ++var6;
            }
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field4284[6] + arg0 + ',' + (arg1 != null ? field4284[7] : field4284[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "e",
      descriptor = "(I)V",
      line = 27
   )
   public static final void method2305(int arg0) {
      try {
         ++field4279;
         class80 var1 = class220.field3139;
         synchronized(class220.field3139) {
            class220.field3139.method715(true);
            if (arg0 != -161) {
               method2306(false, (byte)83);
            }

         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4284[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "a",
      descriptor = "(ZB)C",
      line = 40
   )
   public static final char method2306(boolean arg0, byte arg1) {
      try {
         ++field4283;
         if (!arg0) {
            return (char)65460;
         } else {
            int var2 = arg1 & 255;
            if (var2 == 0) {
               throw new IllegalArgumentException(field4284[3] + Integer.toString(var2, 16) + field4284[2]);
            } else {
               if (var2 >= 128 && ~var2 > -161) {
                  char var3 = class361.field4923[var2 - 128];
                  if (~var3 == -1) {
                     var3 = '?';
                  }

                  var2 = var3;
               }

               return (char)var2;
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field4284[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "a",
      descriptor = "(IIII)[B",
      line = 71
   )
   public final byte[] method2307(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field4282;
         this.field4278 = new byte[arg2 * 2 * arg3 * arg0];
         if (arg1 >= -102) {
            this.field4278 = null;
         }

         this.method2389(arg0, (byte)-105, arg3, arg2);
         return this.field4278;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field4284[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "a",
      descriptor = "(IBB)V",
      line = 84
   )
   public final void method18(int arg0, byte arg1, byte arg2) {
      try {
         ++field4281;
         if (arg2 <= -56) {
            int var4 = arg0 * 2;
            int var5 = 255 & arg1;
            int var8 = var4 + 1;
            this.field4278[var4] = -1;
            this.field4278[var8] = (byte)(var5 * 3 >> 5);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field4284[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "<init>",
      descriptor = "()V",
      line = 100
   )
   public class312() {
      super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
   }

   @OriginalMember(
      owner = "client!tf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2308(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2309(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 30;
            break;
         case 3:
            var10005 = 69;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
