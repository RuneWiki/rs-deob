import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class769 {
   @OriginalMember(
      owner = "client!ql",
      name = "m",
      descriptor = "[B"
   )
   private byte[] field11328 = new byte[64];
   @OriginalMember(
      owner = "client!ql",
      name = "g",
      descriptor = "I"
   )
   private int field11332 = 0;
   @OriginalMember(
      owner = "client!ql",
      name = "e",
      descriptor = "[J"
   )
   private long[] field11329 = new long[8];
   @OriginalMember(
      owner = "client!ql",
      name = "n",
      descriptor = "[J"
   )
   private long[] field11333 = new long[8];
   @OriginalMember(
      owner = "client!ql",
      name = "a",
      descriptor = "I"
   )
   private int field11334 = 0;
   @OriginalMember(
      owner = "client!ql",
      name = "f",
      descriptor = "[J"
   )
   private long[] field11337 = new long[8];
   @OriginalMember(
      owner = "client!ql",
      name = "k",
      descriptor = "[B"
   )
   private byte[] field11338 = new byte[32];
   @OriginalMember(
      owner = "client!ql",
      name = "h",
      descriptor = "[J"
   )
   private long[] field11335 = new long[8];
   @OriginalMember(
      owner = "client!ql",
      name = "l",
      descriptor = "[J"
   )
   private long[] field11336 = new long[8];
   @OriginalMember(
      owner = "client!ql",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11341 = new String[]{method5573(method5572("$\u007fg\u0013\u001d")), method5573(method5572(".=g\u007fH")), method5573(method5572(";f%=")), method5573(method5572("$\u007fg\u0017\u001d")), method5573(method5572("\u0019\\\u000e\u0018vuV\u001b\u0003z\u0007")), method5573(method5572("$\u007fg\u0015\u001d")), method5573(method5572("$\u007fg\u0010\u001d")), method5573(method5572("$\u007fg\u0014\u001d"))};
   @OriginalMember(
      owner = "client!ql",
      name = "i",
      descriptor = "I"
   )
   public static int field11327;
   @OriginalMember(
      owner = "client!ql",
      name = "b",
      descriptor = "I"
   )
   public static int field11330;
   @OriginalMember(
      owner = "client!ql",
      name = "c",
      descriptor = "I"
   )
   public static int field11331;
   @OriginalMember(
      owner = "client!ql",
      name = "j",
      descriptor = "I"
   )
   public static int field11339;
   @OriginalMember(
      owner = "client!ql",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field11340;

   @OriginalMember(
      owner = "client!ql",
      name = "c",
      descriptor = "(I)V",
      line = 4
   )
   public static void method5566(int arg0) {
      try {
         field11340 = null;
         if (arg0 != 0) {
            field11340 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11341[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ql",
      name = "a",
      descriptor = "(I)V",
      line = 14
   )
   private final void method5567(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ql",
      name = "b",
      descriptor = "(I)V",
      line = 120
   )
   public final void method5568(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ql",
      name = "a",
      descriptor = "(Z)V",
      line = 146
   )
   public static final void method5569(boolean arg0) {
      if (arg0) {
         class663.field9659 = class75.field933;
         class731.field10698 = class757.field11220;
      } else {
         class663.field9659 = class121.field1554;
         class731.field10698 = class265.field3658;
      }

      class154.field2185 = class663.field9659.length;
   }

   @OriginalMember(
      owner = "client!ql",
      name = "a",
      descriptor = "(BJ[B)V",
      line = 160
   )
   public final void method5570(byte arg0, long arg1, byte[] arg2) {
      boolean var5 = client.field4360;

      try {
         ++field11330;
         int var6 = 0;
         int var7 = 7 & -((int)arg1 & 7) + 8;
         int var8 = this.field11334 & 7;
         long var9 = arg1;
         if (arg0 < -60) {
            int var11 = 31;
            int var12 = 0;
            int var13;
            if (var5) {
               var13 = (255 & this.field11338[var11]) + (255 & (int)arg1) + var12;
               this.field11338[var11] = (byte)var13;
               var9 = arg1 >>> 8;
               var12 = var13 >>> 8;
               --var11;
            }

            while(true) {
               while(var11 >= 0) {
                  var13 = (255 & this.field11338[var11]) + (255 & (int)var9) + var12;
                  this.field11338[var11] = (byte)var13;
                  var9 >>>= 8;
                  var12 = var13 >>> 8;
                  --var11;
               }

               if (!var5) {
                  int var14;
                  if (var5) {
                     var14 = arg2[var6] << var7 & 255 | (arg2[var6 + 1] & 255) >>> 8 - var7;
                     if (var14 < 0 || ~var14 <= -257) {
                        throw new RuntimeException(field11341[4]);
                     }

                     this.field11328[this.field11332] = (byte)class300.method2238(this.field11328[this.field11332], var14 >>> var8);
                     ++this.field11332;
                     this.field11334 += -var8 + 8;
                     if (this.field11334 == 512) {
                        this.method5567(116);
                        this.field11334 = this.field11332 = 0;
                     }

                     this.field11328[this.field11332] = (byte)class556.method3988(var14 << -var8 + 8, 255);
                     ++var6;
                     this.field11334 += var8;
                     arg1 -= 8L;
                  }

                  while(true) {
                     int var10000;
                     if (~arg1 >= -9L) {
                        long var18;
                        var10000 = (var18 = ~arg1 - -1L) == 0L ? 0 : (var18 < 0L ? -1 : 1);
                        if (!var5) {
                           int var15;
                           label54: {
                              if (var10000 >= 0) {
                                 var15 = 0;
                                 if (!var5) {
                                    break label54;
                                 }
                              }

                              var15 = 255 & arg2[var6] << var7;
                              this.field11328[this.field11332] = (byte)class300.method2238(this.field11328[this.field11332], var15 >>> var8);
                           }

                           if ((long)var8 + arg1 < 8L) {
                              this.field11334 = (int)((long)this.field11334 + arg1);
                              return;
                           }

                           ++this.field11332;
                           this.field11334 += -var8 + 8;
                           arg1 -= (long)(8 - var8);
                           if (~this.field11334 == -513) {
                              this.method5567(105);
                              this.field11334 = this.field11332 = 0;
                           }

                           this.field11328[this.field11332] = (byte)class556.method3988(var15 << -var8 + 8, 255);
                           this.field11334 += (int)arg1;
                           return;
                        }
                     } else {
                        var10000 = arg2[var6] << var7 & 255 | (arg2[var6 + 1] & 255) >>> 8 - var7;
                     }

                     var14 = var10000;
                     if (var14 < 0 || ~var14 <= -257) {
                        throw new RuntimeException(field11341[4]);
                     }

                     this.field11328[this.field11332] = (byte)class300.method2238(this.field11328[this.field11332], var14 >>> var8);
                     ++this.field11332;
                     this.field11334 += -var8 + 8;
                     if (this.field11334 == 512) {
                        this.method5567(116);
                        this.field11334 = this.field11332 = 0;
                     }

                     this.field11328[this.field11332] = (byte)class556.method3988(var14 << -var8 + 8, 255);
                     ++var6;
                     this.field11334 += var8;
                     arg1 -= 8L;
                  }
               }

               --var11;
            }
         }
      } catch (RuntimeException var17) {
         throw class237.method1823(var17, field11341[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11341[1] : field11341[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ql",
      name = "a",
      descriptor = "([BII)V",
      line = 260
   )
   public final void method5571(byte[] arg0, int arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         ++field11339;
         this.field11328[this.field11332] = (byte)class300.method2238(this.field11328[this.field11332], 128 >>> class556.method3988(this.field11334, 7));
         ++this.field11332;
         if (~this.field11332 < -33) {
            if (var4) {
               this.field11328[this.field11332++] = 0;
            }

            while(true) {
               class769 var10000;
               if (this.field11332 >= 64) {
                  this.method5567(126);
                  var10000 = this;
                  if (!var4) {
                     this.field11332 = 0;
                     if (var4) {
                        this.field11328[this.field11332++] = 0;
                     }
                     break;
                  }
               } else {
                  var10000 = this;
               }

               var10000.field11328[this.field11332++] = 0;
            }
         }

         while(true) {
            while(this.field11332 < 32) {
               this.field11328[this.field11332++] = 0;
            }

            byte[] var11 = this.field11338;
            if (!var4) {
               class242.method1848(var11, 0, this.field11328, 32, 32);
               if (arg2 != 6) {
                  return;
               }

               this.method5567(127);
               int var5 = 0;
               int var6 = arg1;
               if (!var4 && var5 >= 8) {
                  return;
               }

               do {
                  long var7 = this.field11337[var5];
                  arg0[var6] = (byte)((int)(var7 >>> 56));
                  arg0[var6 + 1] = (byte)((int)(var7 >>> 48));
                  arg0[var6 - -2] = (byte)((int)(var7 >>> 40));
                  arg0[var6 + 3] = (byte)((int)(var7 >>> 32));
                  arg0[var6 + 4] = (byte)((int)(var7 >>> 24));
                  arg0[var6 - -5] = (byte)((int)(var7 >>> 16));
                  arg0[var6 + 6] = (byte)((int)(var7 >>> 8));
                  arg0[var6 + 7] = (byte)((int)var7);
                  var6 += 8;
                  ++var5;
               } while(var5 < 8);

               return;
            }

            var11[0] = 0;
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field11341[3] + (arg0 != null ? field11341[1] : field11341[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ql",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5572(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 53);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ql",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5573(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 85;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 81;
            break;
         default:
            var10005 = 53;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
