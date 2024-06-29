import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class636 extends class567 {
   @OriginalMember(
      owner = "client!iq",
      name = "w",
      descriptor = "Lfa;"
   )
   private class246 field8993;
   @OriginalMember(
      owner = "client!iq",
      name = "u",
      descriptor = "Lqr;"
   )
   private class71 field8989;
   @OriginalMember(
      owner = "client!iq",
      name = "s",
      descriptor = "Z"
   )
   private boolean field8994;
   @OriginalMember(
      owner = "client!iq",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8995 = new String[]{method4619(method4618("\bVb6\u0001")), method4619(method4618("\u0003U)\u001fB6F8\u001b[%B<\nA")), method4619(method4618("\bVb8\u0001")), method4619(method4618("\u0015N!\u001b")), method4619(method4618("\u0003U)\u001fB6F8\u001b[.A*\rL\u0015")), method4619(method4618("\u0012D-\u0012L")), method4619(method4618("\bVb7\u0001")), method4619(method4618("\bVb=\u0001")), method4619(method4618("\u001a\tbPT")), method4619(method4618("\u000fR \u0012")), method4619(method4618("\bVb:\u0001")), method4619(method4618("\bVb;\u0001")), method4619(method4618("\u0004I:3H\u0011t-\u0013Y\rB>")), method4619(method4618("\u0012R\";Q\u0011H\"\u001bG\u0015")), method4619(method4618("\u0012R\":@\u0013")), method4619(method4618("\u000fH>\u0013H\rt-\u0013Y\rB>")), method4619(method4618("\u0012R\"=F\rH9\f")), method4619(method4618("\bVb?\u0001")), method4619(method4618("\bVb9\u0001")), method4619(method4618("\bVbB@\u000fN8@\u0001")), method4619(method4618("\u0004I:\u0017[\u000eI!\u001bG\u0015x!\u001fY\u0011B(!^\u0000S)\fv\u0007")), method4619(method4618("\u0004I:\u0017[\u000eI!\u001bG\u0015x!\u001fY\u0011B(!^\u0000S)\fv\u0017")), method4619(method4618("\u0006K")), method4619(method4618("\bVb4\u0001")), method4619(method4618("\bVb<\u0001"))};
   @OriginalMember(
      owner = "client!iq",
      name = "C",
      descriptor = "Lnm;"
   )
   public static class502 field8982 = new class502();
   @OriginalMember(
      owner = "client!iq",
      name = "y",
      descriptor = "Lbga;"
   )
   public static class378 field8990 = new class378(39, -2);
   @OriginalMember(
      owner = "client!iq",
      name = "o",
      descriptor = "I"
   )
   public static int field8980;
   @OriginalMember(
      owner = "client!iq",
      name = "r",
      descriptor = "I"
   )
   public static int field8981;
   @OriginalMember(
      owner = "client!iq",
      name = "D",
      descriptor = "I"
   )
   public static int field8983;
   @OriginalMember(
      owner = "client!iq",
      name = "x",
      descriptor = "I"
   )
   public static int field8984;
   @OriginalMember(
      owner = "client!iq",
      name = "A",
      descriptor = "I"
   )
   public static int field8985;
   @OriginalMember(
      owner = "client!iq",
      name = "q",
      descriptor = "I"
   )
   public static int field8986;
   @OriginalMember(
      owner = "client!iq",
      name = "p",
      descriptor = "I"
   )
   public static int field8987;
   @OriginalMember(
      owner = "client!iq",
      name = "t",
      descriptor = "I"
   )
   public static int field8988;
   @OriginalMember(
      owner = "client!iq",
      name = "v",
      descriptor = "I"
   )
   public static int field8991;
   @OriginalMember(
      owner = "client!iq",
      name = "z",
      descriptor = "Z"
   )
   private boolean field8992;

   @OriginalMember(
      owner = "client!iq",
      name = "h",
      descriptor = "(I)V"
   )
   public static void method4614(int arg0) {
      try {
         if (arg0 == 0) {
            field8990 = null;
            field8982 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8995[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method11(byte arg0) {
      try {
         ++field8984;
         if (arg0 > -64) {
            this.field8993 = null;
         }

         return this.field8994;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8995[23] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method3(int arg0) {
      try {
         if (arg0 != 0) {
            this.field8992 = false;
         }

         if (this.field8992) {
            super.field7728.method2506(1, arg0 ^ 106);
            super.field7728.method2581((class159)null, -23);
            super.field7728.method2506(0, -28);
            super.field7728.method2581((class159)null, 124);
            OpenGL.glUseProgramObjectARB(0L);
            this.field8992 = false;
         }

         ++field8985;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8995[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method1(int arg0, boolean arg1) {
      try {
         ++field8986;
         if (arg0 != -1309) {
            this.field8994 = false;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8995[18] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method7(boolean arg0, int arg1) {
      try {
         if (arg1 != 10286) {
            method4615((byte)61, (byte[])null);
         }

         ++field8991;
         class142 var3 = super.field7728.method2492((byte)-65);
         if (this.field8994 && var3 != null) {
            super.field7728.method2506(1, arg1 ^ -10294);
            super.field7728.method2581(var3, 104);
            super.field7728.method2506(0, 114);
            super.field7728.method2581(this.field8993.field3085, 100);
            long var4 = this.field8989.field878;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field8995[15]), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field8995[12]), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, field8995[14]), -super.field7728.field4662[0], -super.field7728.field4662[1], -super.field7728.field4662[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, field8995[16]), super.field7728.field4584, super.field7728.field4622, super.field7728.field4568, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, field8995[13]), 928.0F * Math.abs(super.field7728.field4662[1]) + 96.0F);
            this.field8992 = true;
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field8995[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method9(int arg0, int arg1, int arg2) {
      try {
         ++field8987;
         if (this.field8992) {
            int var4 = 1 << (3 & arg2);
            float var5 = (float)(1 << (7 & arg2 >> 3)) / 32.0F;
            int var6 = arg0 & 65535;
            float var7 = (float)((231846 & arg0) >> 16) / 8.0F;
            long var8 = this.field8989.field878;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field8995[3]), (float)(super.field7728.field4578 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field8995[5]), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field8995[1]), (float)var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field8995[4]), var7);
         }

         int var10 = -11 / ((arg1 - 63) / 58);
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field8995[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "a",
      descriptor = "(B[B)Lgr;"
   )
   public static final class462 method4615(byte arg0, byte[] arg1) {
      boolean var2 = client.field4273;

      try {
         ++field8981;
         class462 var3 = new class462();
         class594 var4 = new class594(arg1);
         var4.field8243 = var4.field8227.length - 2;
         int var5 = var4.method4280(-19104);
         int var6 = 13 / ((arg0 - -87) / 36);
         int var7 = var4.field8227.length - (var5 + 2) + -16;
         var4.field8243 = var7;
         int var8 = var4.method4302(true);
         var3.field6331 = var4.method4280(-19104);
         var3.field6327 = var4.method4280(-19104);
         var3.field6326 = var4.method4280(-19104);
         var3.field6328 = var4.method4280(-19104);
         var3.field6329 = var4.method4280(-19104);
         var3.field6319 = var4.method4280(-19104);
         int var9 = var4.method4288((byte)120);
         if (var9 > 0) {
            var3.field6321 = new class245[var9];
            int var10 = 0;
            if (var2 || var9 > var10) {
               do {
                  int var11 = var4.method4280(-19104);
                  class245 var12 = new class245(class546.method3944(10, var11));
                  var3.field6321[var10] = var12;
                  if (var2 || ~(var11--) < -1) {
                     do {
                        int var13 = var4.method4302(true);
                        int var14 = var4.method4302(true);
                        var12.method1841((long)var13, true, new class144(var14));
                     } while(~(var11--) < -1);
                  }

                  ++var10;
               } while(var9 > var10);
            }
         }

         var4.field8243 = 0;
         var3.field6336 = var4.method4334(4794);
         var3.field6325 = new int[var8];
         int var15 = 0;
         if (!var2 && var7 <= var4.field8243) {
            return var3;
         } else {
            do {
               int var16;
               label111: {
                  var16 = var4.method4280(-19104);
                  if (~var16 == -4) {
                     if (var3.field6318 == null) {
                        var3.field6318 = new String[var8];
                     }

                     var3.field6318[var15] = var4.method4291(-111).intern();
                     if (!var2) {
                        break label111;
                     }
                  }

                  if (~var16 != -55) {
                     if (var3.field6322 == null) {
                        var3.field6322 = new int[var8];
                     }

                     if (~var16 <= -151 || ~var16 == -22 || ~var16 == -39 || ~var16 == -40) {
                        var3.field6322[var15] = var4.method4288((byte)79);
                        if (!var2) {
                           break label111;
                        }
                     }

                     var3.field6322[var15] = var4.method4302(true);
                     if (!var2) {
                        break label111;
                     }
                  }

                  if (var3.field6324 == null) {
                     var3.field6324 = new long[var8];
                  }

                  var3.field6324[var15] = var4.method4304((byte)113);
               }

               var3.field6325[var15++] = var16;
            } while(var7 > var4.field8243);

            return var3;
         }
      } catch (RuntimeException var18) {
         throw class534.method3846(var18, field8995[10] + arg0 + ',' + (arg1 != null ? field8995[8] : field8995[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method4616(boolean param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!iq",
      name = "<init>",
      descriptor = "(Lkfa;Lqh;Lfa;)V"
   )
   public class636(class632 arg0, class74 arg1, class246 arg2) {
      super(arg0);

      try {
         this.field8993 = arg2;
         if (arg1 != null && arg0.field8943 && arg0.field8950) {
            class107 var4 = class739.method5356(arg0, (byte)49, arg1.method720(false, field8995[21], field8995[22]), 35633);
            class107 var5 = class739.method5356(arg0, (byte)120, arg1.method720(false, field8995[20], field8995[22]), 35632);
            this.field8989 = class560.method4030(0, arg0, new class107[]{var4, var5});
            this.field8994 = this.field8989 != null && this.field8993.method1856(-118);
         } else {
            this.field8994 = false;
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field8995[19] + (arg0 != null ? field8995[8] : field8995[9]) + ',' + (arg1 != null ? field8995[8] : field8995[9]) + ',' + (arg2 != null ? field8995[8] : field8995[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "a",
      descriptor = "(ZLho;I)V"
   )
   public final void method8(boolean arg0, class159 arg1, int arg2) {
      try {
         if (!this.field8992) {
            super.field7728.method2581(arg1, 95);
            super.field7728.method2593(0, arg2);
         }

         ++field8980;
         if (!arg0) {
            this.field8989 = null;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field8995[24] + arg0 + ',' + (arg1 != null ? field8995[8] : field8995[9]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "a",
      descriptor = "(ILql;Lql;)V"
   )
   public static final void method4617(int arg0, class770 arg1, class770 arg2) {
      try {
         ++field8988;
         if (arg1.field11090 != null) {
            arg1.method5512((byte)-118);
         }

         arg1.field11090 = arg2.field11090;
         arg1.field11092 = arg2;
         arg1.field11090.field11092 = arg1;
         arg1.field11092.field11090 = arg1;
         if (arg0 != 7) {
            field8990 = null;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8995[7] + arg0 + ',' + (arg1 != null ? field8995[8] : field8995[9]) + ',' + (arg2 != null ? field8995[8] : field8995[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4618(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4619(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 76;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
