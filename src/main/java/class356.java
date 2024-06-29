import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class356 extends class301 {
   @OriginalMember(
      owner = "client!gd",
      name = "u",
      descriptor = "I"
   )
   private int field5013;
   @OriginalMember(
      owner = "client!gd",
      name = "z",
      descriptor = "I"
   )
   private int field5024;
   @OriginalMember(
      owner = "client!gd",
      name = "w",
      descriptor = "I"
   )
   private int field5023;
   @OriginalMember(
      owner = "client!gd",
      name = "t",
      descriptor = "I"
   )
   private int field5011;
   @OriginalMember(
      owner = "client!gd",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5025 = new String[]{method2728(method2727(";b:\u0014P")), method2728(method2727(";b:\u0012P")), method2728(method2727(";b:k\u00112o`iP")), method2728(method2727(";b:\u0013P")), method2728(method2727(";b:\u0016P")), method2728(method2727(";b:\u0015P"))};
   @OriginalMember(
      owner = "client!gd",
      name = "y",
      descriptor = "I"
   )
   public static int field5020 = 0;
   @OriginalMember(
      owner = "client!gd",
      name = "r",
      descriptor = "I"
   )
   private int field5012;
   @OriginalMember(
      owner = "client!gd",
      name = "m",
      descriptor = "I"
   )
   public static int field5014;
   @OriginalMember(
      owner = "client!gd",
      name = "A",
      descriptor = "I"
   )
   public static int field5016;
   @OriginalMember(
      owner = "client!gd",
      name = "o",
      descriptor = "I"
   )
   private int field5017;
   @OriginalMember(
      owner = "client!gd",
      name = "q",
      descriptor = "I"
   )
   public static int field5018;
   @OriginalMember(
      owner = "client!gd",
      name = "n",
      descriptor = "I"
   )
   private int field5019;
   @OriginalMember(
      owner = "client!gd",
      name = "x",
      descriptor = "I"
   )
   public static int field5021;
   @OriginalMember(
      owner = "client!gd",
      name = "p",
      descriptor = "I"
   )
   private int field5022;
   @OriginalMember(
      owner = "client!gd",
      name = "s",
      descriptor = "Leca;"
   )
   public static class789 field5015;
   @OriginalMember(
      owner = "client!gd",
      name = "v",
      descriptor = "[B"
   )
   private byte[] field5010;

   @OriginalMember(
      owner = "client!gd",
      name = "<init>",
      descriptor = "(IIIIIFFF)V",
      line = 3
   )
   public class356(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
      super(arg0, arg1, arg2, arg3, arg4);

      try {
         this.field5013 = (int)(arg6 * 4096.0F);
         this.field5024 = (int)(arg7 * 4096.0F);
         this.field5011 = this.field5023 = (int)(4096.0D * Math.pow(0.5D, (double)(-arg5)));
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field5025[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "(IIB)V",
      line = 18
   )
   public void method1529(int arg0, int arg1, byte arg2) {
      try {
         if (arg1 >= -87) {
            method2726((byte)47);
         }

         this.field5010[arg0] = arg2;
         ++field5018;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5025[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "(IBI)V",
      line = 33
   )
   public final void method2350(int arg0, byte arg1, int arg2) {
      try {
         ++field5021;
         int var4 = 111 % ((arg1 - -44) / 50);
         if (arg2 != 0) {
            label32: {
               this.field5019 = this.field5024 * this.field5012 >> 12;
               this.field5012 = -(~arg0 > -1 ? -arg0 : arg0) + this.field5013;
               if (~this.field5019 <= -1) {
                  if (this.field5019 <= 4096) {
                     break label32;
                  }

                  this.field5019 = 4096;
                  if (!client.field4564) {
                     break label32;
                  }
               }

               this.field5019 = 0;
            }

            this.field5012 = this.field5012 * this.field5012 >> 12;
            this.field5012 = this.field5019 * this.field5012 >> 12;
            this.field5017 += this.field5012 * this.field5011 >> 12;
            this.field5011 = this.field5023 * this.field5011 >> 12;
         } else {
            this.field5012 = this.field5013 - (~arg0 > -1 ? -arg0 : arg0);
            this.field5012 = this.field5012 * this.field5012 >> 12;
            this.field5019 = 4096;
            this.field5017 = this.field5012;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field5025[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "b",
      descriptor = "(B)V",
      line = 70
   )
   public static void method2726(byte arg0) {
      try {
         int var1 = 35 / ((67 - arg0) / 55);
         field5015 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5025[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "(B)V",
      line = 87
   )
   public final void method2343(byte arg0) {
      try {
         label23: {
            this.field5017 >>= 4;
            this.field5011 = this.field5023;
            ++field5014;
            if (this.field5017 < 0) {
               this.field5017 = 0;
               if (!client.field4564) {
                  break label23;
               }
            }

            if (~this.field5017 < -256) {
               this.field5017 = 255;
            }
         }

         this.method1529(this.field5022++, -114, (byte)this.field5017);
         if (arg0 != 19) {
            this.method2350(-36, (byte)72, -110);
         }

         this.field5017 = 0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5025[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "(I)V",
      line = 109
   )
   public final void method2346(int arg0) {
      try {
         ++field5016;
         this.field5022 = 0;
         this.field5017 = 0;
         if (arg0 != -31077) {
            this.field5013 = -116;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5025[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2727(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 120);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2728(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 6;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 120;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
