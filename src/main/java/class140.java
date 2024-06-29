import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class140 {
   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "I"
   )
   private int field1863 = 0;
   @OriginalMember(
      owner = "client!hw",
      name = "q",
      descriptor = "[J"
   )
   private long[] field1861 = new long[8];
   @OriginalMember(
      owner = "client!hw",
      name = "n",
      descriptor = "[J"
   )
   private long[] field1867 = new long[8];
   @OriginalMember(
      owner = "client!hw",
      name = "o",
      descriptor = "[B"
   )
   private byte[] field1857 = new byte[64];
   @OriginalMember(
      owner = "client!hw",
      name = "f",
      descriptor = "[J"
   )
   private long[] field1866 = new long[8];
   @OriginalMember(
      owner = "client!hw",
      name = "p",
      descriptor = "[J"
   )
   private long[] field1865 = new long[8];
   @OriginalMember(
      owner = "client!hw",
      name = "l",
      descriptor = "[B"
   )
   private byte[] field1870 = new byte[32];
   @OriginalMember(
      owner = "client!hw",
      name = "i",
      descriptor = "[J"
   )
   private long[] field1855 = new long[8];
   @OriginalMember(
      owner = "client!hw",
      name = "k",
      descriptor = "I"
   )
   private int field1872 = 0;
   @OriginalMember(
      owner = "client!hw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1873 = new String[]{method1203(method1202("Xv{~\u0012")), method1203(method1202("^t9U")), method1203(method1202("K/{\u0017G")), method1203(method1202("Xv{x\u0012")), method1203(method1202("Xv{{\u0012")), method1203(method1202("|N\u0012py\u0010D\u0007kub")), method1203(method1202("Xv{|\u0012")), method1203(method1202("Xv{p\u0012")), method1203(method1202("Xv{\u007f\u0012")), method1203(method1202("@` J_")), method1203(method1202("\u0010r0ZU^e&\u0017\u0014\u001e")), method1203(method1202("`` JS^fu_UB!")), method1203(method1202("Xv{}\u0012")), method1203(method1202("Xv{q\u0012")), method1203(method1202("Xv{z\u0012"))};
   @OriginalMember(
      owner = "client!hw",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field1862 = new int[3];
   @OriginalMember(
      owner = "client!hw",
      name = "h",
      descriptor = "I"
   )
   public static int field1856;
   @OriginalMember(
      owner = "client!hw",
      name = "m",
      descriptor = "I"
   )
   public static int field1858;
   @OriginalMember(
      owner = "client!hw",
      name = "d",
      descriptor = "I"
   )
   public static int field1859;
   @OriginalMember(
      owner = "client!hw",
      name = "r",
      descriptor = "I"
   )
   public static int field1860;
   @OriginalMember(
      owner = "client!hw",
      name = "g",
      descriptor = "I"
   )
   public static int field1864;
   @OriginalMember(
      owner = "client!hw",
      name = "e",
      descriptor = "I"
   )
   public static int field1868;
   @OriginalMember(
      owner = "client!hw",
      name = "b",
      descriptor = "I"
   )
   public static int field1869;
   @OriginalMember(
      owner = "client!hw",
      name = "c",
      descriptor = "I"
   )
   public static int field1871;

   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "([Ljava/lang/String;I)V"
   )
   public static final void method1193(String[] arg0, int arg1) {
      boolean var2 = client.field4273;

      RuntimeException var10000;
      label58: {
         boolean var10001;
         int var4;
         label57: {
            try {
               ++field1864;
               int var3 = 50 % ((arg1 - -6) / 51);
               if (arg0.length <= 1) {
                  class203.field2495 = class203.field2495 + arg0[0];
                  class7.field66 += arg0[0].length();
                  return;
               }

               var4 = 0;
               if (var2 || ~arg0.length < ~var4) {
                  do {
                     if (arg0[var4].startsWith(field1873[9])) {
                        break label57;
                     }

                     class203.field2495 = arg0[var4];
                     class519.method3762((byte)92, false);
                     if (var2) {
                        break label57;
                     }

                     ++var4;
                  } while(~arg0.length < ~var4);
               }
            } catch (RuntimeException var9) {
               var10000 = var9;
               var10001 = false;
               break label58;
            }

            if (!var2) {
               return;
            }
         }

         try {
            int var5 = 5;

            try {
               var5 = Integer.parseInt(arg0[var4].substring(6));
            } catch (Exception var7) {
            }

            class705.method5131(field1873[11] + var5 + field1873[10], 0);
            class578.field7925 = var4 + 1;
            class599.field8359 = arg0;
            class336.field4814 = (long)(var5 * 1000) + class792.method5708(-25005);
            return;
         } catch (RuntimeException var8) {
            var10000 = var8;
            var10001 = false;
         }
      }

      RuntimeException var6 = var10000;
      throw class534.method3846(var6, field1873[12] + (arg0 != null ? field1873[2] : field1873[1]) + ',' + arg1 + ')');
   }

   @OriginalMember(
      owner = "client!hw",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method1194(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "(B)V"
   )
   private final void method1195(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "(JI[B)V"
   )
   public final void method1196(long arg0, int arg1, byte[] arg2) {
      boolean var5 = client.field4273;

      try {
         ++field1859;
         int var6 = 0;
         int var7 = -((int)arg0 & 7) + 8 & 7;
         int var8 = this.field1872 & 7;
         long var9 = arg0;
         if (arg1 == 21089) {
            int var11 = 31;
            int var12 = 0;
            int var13;
            if (var5) {
               var13 = (this.field1870[var11] & 255) - -((int)arg0 & 255) + var12;
               this.field1870[var11] = (byte)var13;
               var12 = var13 >>> 8;
               var9 = arg0 >>> 8;
               --var11;
            }

            while(true) {
               while(~var11 <= -1) {
                  var13 = (this.field1870[var11] & 255) - -((int)var9 & 255) + var12;
                  this.field1870[var11] = (byte)var13;
                  var12 = var13 >>> 8;
                  var9 >>>= 8;
                  --var11;
               }

               if (!var5) {
                  int var14;
                  if (var5) {
                     var14 = 255 & arg2[var6] << var7 | (arg2[var6 + 1] & 255) >>> -var7 + 8;
                     if (var14 < 0 || ~var14 <= -257) {
                        throw new RuntimeException(field1873[5]);
                     }

                     this.field1857[this.field1863] = (byte)class283.method2155(this.field1857[this.field1863], var14 >>> var8);
                     ++this.field1863;
                     this.field1872 += -var8 + 8;
                     if (this.field1872 == 512) {
                        this.method1195((byte)-43);
                        this.field1872 = this.field1863 = 0;
                     }

                     this.field1857[this.field1863] = (byte)class743.method5375(255, var14 << -var8 + 8);
                     this.field1872 += var8;
                     arg0 -= 8L;
                     ++var6;
                  }

                  while(true) {
                     int var10000;
                     if (arg0 <= 8L) {
                        long var18;
                        var10000 = (var18 = arg0 - 0L) == 0L ? 0 : (var18 < 0L ? -1 : 1);
                        if (!var5) {
                           int var15;
                           label54: {
                              if (var10000 <= 0) {
                                 var15 = 0;
                                 if (!var5) {
                                    break label54;
                                 }
                              }

                              var15 = arg2[var6] << var7 & 255;
                              this.field1857[this.field1863] = (byte)class283.method2155(this.field1857[this.field1863], var15 >>> var8);
                           }

                           if ((long)var8 - -arg0 >= 8L) {
                              arg0 -= (long)(-var8 + 8);
                              this.field1872 += -var8 + 8;
                              ++this.field1863;
                              if (~this.field1872 == -513) {
                                 this.method1195((byte)-43);
                                 this.field1872 = this.field1863 = 0;
                              }

                              this.field1857[this.field1863] = (byte)class743.method5375(var15 << -var8 + 8, 255);
                              this.field1872 += (int)arg0;
                              return;
                           }

                           this.field1872 = (int)((long)this.field1872 + arg0);
                           return;
                        }
                     } else {
                        var10000 = 255 & arg2[var6] << var7 | (arg2[var6 + 1] & 255) >>> -var7 + 8;
                     }

                     var14 = var10000;
                     if (var14 < 0 || ~var14 <= -257) {
                        throw new RuntimeException(field1873[5]);
                     }

                     this.field1857[this.field1863] = (byte)class283.method2155(this.field1857[this.field1863], var14 >>> var8);
                     ++this.field1863;
                     this.field1872 += -var8 + 8;
                     if (this.field1872 == 512) {
                        this.method1195((byte)-43);
                        this.field1872 = this.field1863 = 0;
                     }

                     this.field1857[this.field1863] = (byte)class743.method5375(255, var14 << -var8 + 8);
                     this.field1872 += var8;
                     arg0 -= 8L;
                     ++var6;
                  }
               }

               --var11;
            }
         }
      } catch (RuntimeException var17) {
         throw class534.method3846(var17, field1873[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1873[2] : field1873[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method1197(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1198(int arg0) {
      try {
         field1862 = null;
         if (arg0 <= 87) {
            field1862 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1873[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "(II[B)V"
   )
   public final void method1199(int arg0, int arg1, byte[] arg2) {
      boolean var4 = client.field4273;

      try {
         ++field1869;
         if (arg0 == 1249913336) {
            this.field1857[this.field1863] = (byte)class283.method2155(this.field1857[this.field1863], 128 >>> class743.method5375(7, this.field1872));
            ++this.field1863;
            class140 var10000;
            if (~this.field1863 < -33) {
               if (var4) {
                  this.field1857[this.field1863++] = 0;
               }

               while(true) {
                  if (~this.field1863 <= -65) {
                     this.method1195((byte)-43);
                     var10000 = this;
                     if (!var4) {
                        this.field1863 = 0;
                        if (var4) {
                           this.field1857[this.field1863++] = 0;
                        }
                        break;
                     }
                  } else {
                     var10000 = this;
                  }

                  var10000.field1857[this.field1863++] = 0;
               }
            }

            while(true) {
               if (this.field1863 >= 32) {
                  class714.method5200(this.field1870, 0, this.field1857, 32, 32);
                  var10000 = this;
                  if (!var4) {
                     this.method1195((byte)-43);
                     int var5 = 0;
                     int var6 = arg1;
                     if (!var4 && var5 >= 8) {
                        return;
                     } else {
                        do {
                           long var7 = this.field1861[var5];
                           arg2[var6] = (byte)((int)(var7 >>> 56));
                           arg2[var6 + 1] = (byte)((int)(var7 >>> 48));
                           arg2[var6 + 2] = (byte)((int)(var7 >>> 40));
                           arg2[var6 + 3] = (byte)((int)(var7 >>> 32));
                           arg2[var6 + 4] = (byte)((int)(var7 >>> 24));
                           arg2[var6 - -5] = (byte)((int)(var7 >>> 16));
                           arg2[var6 + 6] = (byte)((int)(var7 >>> 8));
                           arg2[var6 + 7] = (byte)((int)var7);
                           var6 += 8;
                           ++var5;
                        } while(var5 < 8);

                        return;
                     }
                  }
               } else {
                  var10000 = this;
               }

               var10000.field1857[this.field1863++] = 0;
            }
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field1873[13] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1873[2] : field1873[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method1200(int arg0) {
      try {
         ++field1871;
         if (arg0 != 598945540) {
            field1862 = null;
         }

         class397.method3019(87, 12);
         class593.method4263(arg0 ^ 598944835);
         System.gc();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1873[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "(ILwm;)Lhu;"
   )
   public static final class141 method1201(int arg0, class594 arg1) {
      try {
         ++field1860;
         String var2 = arg1.method4291(arg0 + -20);
         if (arg0 != 0) {
            method1200(4);
         }

         class190 var3 = class127.method1068((byte)71)[arg1.method4288((byte)70)];
         class169 var4 = class393.method2992(119)[arg1.method4288((byte)104)];
         int var5 = arg1.method4333(-96);
         int var6 = arg1.method4333(-57);
         int var7 = arg1.method4288((byte)97);
         int var8 = arg1.method4288((byte)81);
         int var9 = arg1.method4288((byte)111);
         int var10 = arg1.method4280(-19104);
         int var11 = arg1.method4280(-19104);
         int var12 = arg1.method4302(true);
         int var13 = arg1.method4302(true);
         int var14 = arg1.method4302(true);
         return new class141(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
      } catch (RuntimeException var16) {
         throw class534.method3846(var16, field1873[3] + arg0 + ',' + (arg1 != null ? field1873[2] : field1873[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1202(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1203(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 48;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 85;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
