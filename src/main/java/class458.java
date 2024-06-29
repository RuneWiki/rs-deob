import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class458 extends class546 {
   @OriginalMember(
      owner = "client!ss",
      name = "I",
      descriptor = "Luo;"
   )
   public class606 field6269;
   @OriginalMember(
      owner = "client!ss",
      name = "u",
      descriptor = "Lsb;"
   )
   public class307 field6276;
   @OriginalMember(
      owner = "client!ss",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6285 = new String[]{method3373(method3372("V\u000f${")), method3373(method3372("K\tfT]")), method3373(method3372("CTf9\b")), method3373(method3372("K\tfS]")), method3373(method3372("K\tfQ]")), method3373(method3372("K\tf_]")), method3373(method3372("K\tfV]")), method3373(method3372("K\tf+\u001cV\u0013<)]")), method3373(method3372("K\tfU]")), method3373(method3372("K\tfP]")), method3373(method3372("K\tfR]"))};
   @OriginalMember(
      owner = "client!ss",
      name = "G",
      descriptor = "I"
   )
   public int field6270;
   @OriginalMember(
      owner = "client!ss",
      name = "H",
      descriptor = "I"
   )
   public static int field6271;
   @OriginalMember(
      owner = "client!ss",
      name = "E",
      descriptor = "I"
   )
   public static int field6272;
   @OriginalMember(
      owner = "client!ss",
      name = "z",
      descriptor = "I"
   )
   public int field6273;
   @OriginalMember(
      owner = "client!ss",
      name = "t",
      descriptor = "I"
   )
   public static int field6274;
   @OriginalMember(
      owner = "client!ss",
      name = "F",
      descriptor = "I"
   )
   public static int field6275;
   @OriginalMember(
      owner = "client!ss",
      name = "v",
      descriptor = "I"
   )
   public static int field6277;
   @OriginalMember(
      owner = "client!ss",
      name = "w",
      descriptor = "I"
   )
   public int field6278;
   @OriginalMember(
      owner = "client!ss",
      name = "D",
      descriptor = "I"
   )
   public static int field6279;
   @OriginalMember(
      owner = "client!ss",
      name = "x",
      descriptor = "I"
   )
   public static int field6280;
   @OriginalMember(
      owner = "client!ss",
      name = "B",
      descriptor = "I"
   )
   public static int field6281;
   @OriginalMember(
      owner = "client!ss",
      name = "y",
      descriptor = "I"
   )
   public int field6282;
   @OriginalMember(
      owner = "client!ss",
      name = "A",
      descriptor = "I"
   )
   public int field6283;
   @OriginalMember(
      owner = "client!ss",
      name = "C",
      descriptor = "I"
   )
   public static int field6284;

   @OriginalMember(
      owner = "client!ss",
      name = "b",
      descriptor = "(III)Z"
   )
   public static final boolean method3364(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != -13851) {
            return true;
         } else {
            ++field6279;
            return ~(2048 & arg2) != -1;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6285[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "a",
      descriptor = "(IZ[B)I"
   )
   public static final int method3365(int arg0, boolean arg1, byte[] arg2) {
      try {
         if (!arg1) {
            return -70;
         } else {
            ++field6284;
            return class263.method2024(-1, 0, arg2, arg0);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6285[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6285[2] : field6285[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method3366(int arg0) {
      try {
         ++field6271;
         this.field6273 = this.field6269.field8481;
         this.field6278 = this.field6269.field8492;
         this.field6282 = this.field6269.field8489;
         if (this.field6269.field8485 != null) {
            this.field6269.field8485.method142(this.field6276.field4084, this.field6276.field4082, this.field6276.field4070, class329.field4713);
         }

         this.field6283 = class329.field4713[0];
         this.field6270 = class329.field4713[2];
         int var2 = 91 / ((-28 - arg0) / 49);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6285[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3367(int arg0, int arg1, int arg2) {
      try {
         ++field6281;
         if (arg2 != -25291) {
            field6280 = 72;
         }

         return class28.method234(arg1, arg0, arg2 + 25293) || class279.method2121(arg2 ^ -24779, arg1, arg0);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6285[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "a",
      descriptor = "(IJZIB)Ljava/lang/String;"
   )
   public static final String method3368(int arg0, long arg1, boolean arg2, int arg3, byte arg4) {
      boolean var6 = client.field4273;

      try {
         ++field6272;
         char var7 = ',';
         char var8 = '.';
         int var9 = -19 / ((57 - arg4) / 51);
         if (~arg0 == -1) {
            var7 = '.';
            var8 = ',';
         }

         if (~arg0 == -3) {
            var8 = 160;
         }

         byte var10 = 0;
         if (~arg1 > -1L) {
            arg1 = -arg1;
            var10 = 1;
         }

         StringBuffer var11 = new StringBuffer(26);
         if (~arg3 < -1) {
            int var12 = 0;
            if (var6 || ~var12 > ~arg3) {
               do {
                  int var13 = (int)arg1;
                  arg1 /= 10L;
                  var11.append((char)(var13 + 48 + -((int)arg1 * 10)));
                  ++var12;
               } while(~var12 > ~arg3);
            }

            var11.append(var7);
         }

         int var14 = 0;

         int var10000;
         while(true) {
            int var15 = (int)arg1;
            arg1 /= 10L;
            var11.append((char)(var15 + 48 - (int)arg1 * 10));
            if (arg1 != 0L) {
               if (!arg2) {
                  continue;
               }

               ++var14;
               var10000 = var14 % 3;
               if (var6) {
                  break;
               }

               if (var10000 != 0) {
                  continue;
               }

               var11.append(var8);
               if (!var6) {
                  continue;
               }
            }

            var10000 = var10;
            break;
         }

         if (var10000 != 0) {
            var11.append('-');
         }

         return var11.reverse().toString();
      } catch (RuntimeException var17) {
         throw class534.method3846(var17, field6285[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public static final void method3369(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field4273;

      try {
         ++field6277;
         int var12 = arg4 + 1;
         class125.method1046(-23355, arg3, class17.field236[arg4], arg1, arg5);
         int var11 = arg0 - 1;
         class125.method1046(-23355, arg3, class17.field236[arg0], arg1, arg5);
         int var7 = var12;
         if (!var6 && var12 > var11) {
            if (arg2 != 10) {
               method3365(-96, true, (byte[])null);
            }
         } else {
            do {
               int[] var8 = class17.field236[var7];
               var8[arg5] = var8[arg3] = arg1;
               ++var7;
            } while(var7 <= var11);

            if (arg2 != 10) {
               method3365(-96, true, (byte[])null);
            }
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field6285[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "c",
      descriptor = "(Z)V"
   )
   public static final void method3370(boolean arg0) {
      try {
         ++field6275;
         class613.field8573 = new class241(class551.field7525.method3980(class494.field6787, true), "", class325.field4354, 1003, -1, 0L, 0, 0, true, arg0, 0L, true);
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6285[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "<init>",
      descriptor = "(Luo;Lrg;)V"
   )
   public class458(class606 arg0, class672 arg1) {
      try {
         this.field6269 = arg0;
         this.field6276 = this.field6269.method4425(-1);
         this.method3366(91);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6285[7] + (arg0 != null ? field6285[2] : field6285[0]) + ',' + (arg1 != null ? field6285[2] : field6285[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method3371(int arg0) {
      try {
         if (class708.field10284 >= 0) {
            long var1;
            label24: {
               var1 = class792.method5708(arg0 + -25031);
               class708.field10284 = (int)((long)class708.field10284 - (var1 - class759.field10985));
               if (class708.field10284 <= 0) {
                  class365.field5152 = class349.field5000.field7021;
                  class13.field153 = class349.field5000.field7022;
                  class592.field8184 = class349.field5000.field7020;
                  class430.field5992 = class349.field5000.field7033;
                  class288.field3822 = class349.field5000.field7023;
                  class663.field9458 = class349.field5000.field7035;
                  class427.field5963 = class349.field5000.field7031;
                  class682.field10007 = class349.field5000.field7029;
                  class114.field1411 = class349.field5000.field7026;
                  class277.field3704 = class349.field5000.field7019;
                  class708.field10284 = -1;
                  if (!client.field4273) {
                     break label24;
                  }
               }

               int var3 = (class708.field10284 << 8) / class78.field974;
               int var4 = -var3 + 255;
               float var5 = (float)var3 / 255.0F;
               class365.field5152 = (16711680 & (class533.field7288 & 65280) * var3 + (class349.field5000.field7021 & 65280) * var4) + (-16711936 & (16711935 & class533.field7288) * var3 + (class349.field5000.field7021 & 16711935) * var4) >>> 8;
               float var6 = 1.0F - var5;
               class277.field3704 = (16711680 & (class680.field9970 & 65280) * var3 + (65280 & class349.field5000.field7019) * var4) + (-16711936 & (class680.field9970 & 16711935) * var3 + (16711935 & class349.field5000.field7019) * var4) >>> 8;
               class13.field153 = class406.field5731 * var3 - -(class349.field5000.field7022 * var4) >> 8;
               class288.field3822 = (-client.field4268 + class349.field5000.field7023) * var6 + client.field4268;
               class663.field9458 = (-class170.field2137 + class349.field5000.field7035) * var6 + class170.field2137;
               class682.field10007 = (class349.field5000.field7029 - class356.field5072) * var6 + class356.field5072;
               class592.field8184 = (class349.field5000.field7020 - class195.field2372) * var6 + class195.field2372;
               class114.field1411 = (-class224.field2815 + class349.field5000.field7026) * var6 + class224.field2815;
               class430.field5992 = (-class329.field4712 + class349.field5000.field7033) * var6 + class329.field4712;
               if (class317.field4233 != class349.field5000.field7031) {
                  class427.field5963 = class252.field3198.method597(class317.field4233, class349.field5000.field7031, var6, class427.field5963);
               }
            }

            class759.field10985 = var1;
         }

         ++field6274;
         if (arg0 != 26) {
            method3367(-77, 124, 93);
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field6285[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3372(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ss",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3373(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 56;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 23;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
