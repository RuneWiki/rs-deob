import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class796 implements Runnable {
   @OriginalMember(
      owner = "client!fs",
      name = "c",
      descriptor = "I"
   )
   private int field11567 = 0;
   @OriginalMember(
      owner = "client!fs",
      name = "w",
      descriptor = "Z"
   )
   private boolean field11569 = false;
   @OriginalMember(
      owner = "client!fs",
      name = "x",
      descriptor = "I"
   )
   private int field11578 = 0;
   @OriginalMember(
      owner = "client!fs",
      name = "g",
      descriptor = "Z"
   )
   private boolean field11574 = false;
   @OriginalMember(
      owner = "client!fs",
      name = "y",
      descriptor = "Ljava/net/Socket;"
   )
   private Socket field11559;
   @OriginalMember(
      owner = "client!fs",
      name = "u",
      descriptor = "Lfea;"
   )
   private class82 field11558;
   @OriginalMember(
      owner = "client!fs",
      name = "e",
      descriptor = "Ljava/io/InputStream;"
   )
   private InputStream field11579;
   @OriginalMember(
      owner = "client!fs",
      name = "t",
      descriptor = "Ljava/io/OutputStream;"
   )
   private OutputStream field11557;
   @OriginalMember(
      owner = "client!fs",
      name = "d",
      descriptor = "I"
   )
   private int field11577;
   @OriginalMember(
      owner = "client!fs",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11583 = new String[]{method5741(method5740("\ft:\u0004E")), method5741(method5740("\ft:\u0003E")), method5741(method5740("\ft:)\u0004\u0004fx&\u0017\u000f/")), method5741(method5740("\ft:\u0005E")), method5741(method5740("\u0004rx#")), method5741(method5740("\u0011):a\u0010")), method5741(method5740("\ft:\u000eE")), method5741(method5740("\ft:=\u0018\u0004/")), method5741(method5740("\ft:\nE")), method5741(method5740("\ft:\u0002E")), method5741(method5740("\ft:\u000bE")), method5741(method5740("\ft:\u0007E")), method5741(method5740("\ft:s\u0004\u0004n`qE")), method5741(method5740("\ft:\bE")), method5741(method5740("\ft:\tE")), method5741(method5740("\ft:\rE")), method5741(method5740("\ft:\u0006E")), method5741(method5740("\ft:\fE"))};
   @OriginalMember(
      owner = "client!fs",
      name = "k",
      descriptor = "I"
   )
   public static int field11560;
   @OriginalMember(
      owner = "client!fs",
      name = "f",
      descriptor = "I"
   )
   public static int field11561;
   @OriginalMember(
      owner = "client!fs",
      name = "o",
      descriptor = "I"
   )
   public static int field11562;
   @OriginalMember(
      owner = "client!fs",
      name = "s",
      descriptor = "I"
   )
   public static int field11563;
   @OriginalMember(
      owner = "client!fs",
      name = "z",
      descriptor = "I"
   )
   public static int field11564;
   @OriginalMember(
      owner = "client!fs",
      name = "i",
      descriptor = "I"
   )
   public static int field11566;
   @OriginalMember(
      owner = "client!fs",
      name = "h",
      descriptor = "I"
   )
   public static int field11568;
   @OriginalMember(
      owner = "client!fs",
      name = "r",
      descriptor = "I"
   )
   public static int field11570;
   @OriginalMember(
      owner = "client!fs",
      name = "m",
      descriptor = "I"
   )
   public static int field11571;
   @OriginalMember(
      owner = "client!fs",
      name = "l",
      descriptor = "I"
   )
   public static int field11572;
   @OriginalMember(
      owner = "client!fs",
      name = "j",
      descriptor = "I"
   )
   public static int field11573;
   @OriginalMember(
      owner = "client!fs",
      name = "v",
      descriptor = "I"
   )
   public static int field11575;
   @OriginalMember(
      owner = "client!fs",
      name = "b",
      descriptor = "I"
   )
   public static int field11576;
   @OriginalMember(
      owner = "client!fs",
      name = "n",
      descriptor = "I"
   )
   public static int field11581;
   @OriginalMember(
      owner = "client!fs",
      name = "q",
      descriptor = "I"
   )
   public static int field11582;
   @OriginalMember(
      owner = "client!fs",
      name = "p",
      descriptor = "Ldu;"
   )
   private class92 field11580;
   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "[B"
   )
   private byte[] field11565;

   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "(FFBFI)F"
   )
   public static final float method5727(float arg0, float arg1, byte arg2, float arg3, int arg4) {
      try {
         ++field11581;
         int var5 = -96 / ((arg2 - -39) / 47);
         float[] var6 = class733.field10422[arg4];
         return var6[2] * arg0 + var6[1] * arg1 + var6[0] * arg3;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field11583[16] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method5728(boolean arg0) {
      boolean var2 = client.field10022;

      try {
         ++field11570;
         if (!this.field11569) {
            synchronized(this) {
               this.field11569 = arg0;
               this.notifyAll();
            }

            if (this.field11580 != null) {
               if (var2) {
                  class97.method968(32353, 1L);
               }

               while(true) {
                  int var10000;
                  if (~this.field11580.field1526 != -1) {
                     var10000 = this.field11580.field1526;
                     if (!var2) {
                        if (var10000 == 1) {
                           try {
                              ((Thread)this.field11580.field1525).join();
                           } catch (InterruptedException var5) {
                           }
                        }
                        break;
                     }
                  } else {
                     var10000 = 32353;
                  }

                  class97.method968(var10000, 1L);
               }
            }

            this.field11580 = null;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field11583[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method5729(int arg0) {
      boolean var1 = client.field10022;

      try {
         ++field11566;
         if (~class537.field7550 != 0 && class134.field2184 != -1) {
            label84: {
               int var2 = class772.field11181 - -((class339.field4997 - class772.field11181) * class530.field7475 >> 16);
               class530.field7475 += var2;
               if (class530.field7475 < 65535) {
                  class206.field2927 = false;
                  class556.field7900 = false;
                  if (!var1) {
                     break label84;
                  }
               }

               label71: {
                  class530.field7475 = 65535;
                  if (!class206.field2927) {
                     class556.field7900 = true;
                     if (!var1) {
                        break label71;
                     }
                  }

                  class556.field7900 = false;
               }

               class206.field2927 = true;
            }

            float var3;
            float[] var4;
            int var5;
            float[] var14;
            int var15;
            int var10000;
            label54: {
               var3 = (float)class530.field7475 / 65535.0F;
               var4 = new float[3];
               var5 = class446.field6498 * 2;
               int var6 = 0;
               if (var1) {
                  var10000 = class505.field7191[class537.field7550][var5][var6] * 3;
               } else if (var6 >= 3) {
                  class222.field3158 = (int)var4[2] + -(class480.field6903 * 512);
                  class670.field9407 = (int)var4[0] + -(class115.field1824 * 512);
                  class576.field8141 = (int)var4[1] * -1;
                  var14 = new float[3];
                  var15 = class95.field1544 * 2;
                  var10000 = 0;
                  if (!var1) {
                     break label54;
                  }
               } else {
                  var10000 = class505.field7191[class537.field7550][var5][var6] * 3;
               }

               while(true) {
                  int var7 = var10000;
                  int var8 = class505.field7191[class537.field7550][var5 + 1][var6] * 3;
                  int var9 = (class505.field7191[class537.field7550][var5 + 2][var6] - (class505.field7191[class537.field7550][var5 + 3][var6] - class505.field7191[class537.field7550][var5 - -2][var6])) * 3;
                  int var10 = class505.field7191[class537.field7550][var5][var6];
                  int var11 = -var7 + var8;
                  int var12 = -(var8 * 2) - -var9 + var7;
                  int var13 = -var10 + var8 + class505.field7191[class537.field7550][var5 + 2][var6] + -var9;
                  var4[var6] = (((float)var13 * var3 + (float)var12) * var3 + (float)var11) * var3 + (float)var10;
                  ++var6;
                  if (var6 >= 3) {
                     class222.field3158 = (int)var4[2] + -(class480.field6903 * 512);
                     class670.field9407 = (int)var4[0] + -(class115.field1824 * 512);
                     class576.field8141 = (int)var4[1] * -1;
                     var14 = new float[3];
                     var15 = class95.field1544 * 2;
                     var10000 = 0;
                     if (!var1) {
                        break;
                     }
                  } else {
                     var10000 = class505.field7191[class537.field7550][var5][var6] * 3;
                  }
               }
            }

            int var16 = var10000;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            int var23;
            if (var1) {
               var17 = class505.field7191[class134.field2184][var15][var16] * 3;
               var18 = class505.field7191[class134.field2184][var15 + 1][var16] * 3;
               var19 = (class505.field7191[class134.field2184][var15 - -2][var16] + -class505.field7191[class134.field2184][var15 + 3][var16] + class505.field7191[class134.field2184][var15 - -2][var16]) * 3;
               var20 = class505.field7191[class134.field2184][var15][var16];
               var21 = -var17 + var18;
               var22 = var17 + var19 - var18 * 2;
               var23 = -var19 + var18 + -var20 + class505.field7191[class134.field2184][var15 + 2][var16];
               var14[var16] = (((float)var23 * var3 + (float)var22) * var3 + (float)var21) * var3 + (float)var20;
               ++var16;
            }

            while(true) {
               short var10001;
               if (var16 >= 3) {
                  float var24 = var14[0] + -var4[0];
                  var10000 = arg0;
                  var10001 = 10501;
                  if (!var1) {
                     if (arg0 != 10501) {
                        return;
                     }

                     float var25 = (var14[1] + -var4[1]) * -1.0F;
                     float var26 = var14[2] - var4[2];
                     double var27 = Math.sqrt((double)(var24 * var24 + var26 * var26));
                     class313.field4701 = (int)(2607.5945876176133D * Math.atan2((double)var25, var27)) & 16383;
                     class75.field1201 = (int)(2607.5945876176133D * -Math.atan2((double)var24, (double)var26)) & 16383;
                     class103.field1628 = class505.field7191[class537.field7550][var5][3] - -((class505.field7191[class537.field7550][var5 + 2][3] + -class505.field7191[class537.field7550][var5][3]) * class530.field7475 >> 16);
                     return;
                  }
               } else {
                  var10000 = class505.field7191[class134.field2184][var15][var16];
                  var10001 = 3;
               }

               var17 = var10000 * var10001;
               var18 = class505.field7191[class134.field2184][var15 + 1][var16] * 3;
               var19 = (class505.field7191[class134.field2184][var15 - -2][var16] + -class505.field7191[class134.field2184][var15 + 3][var16] + class505.field7191[class134.field2184][var15 - -2][var16]) * 3;
               var20 = class505.field7191[class134.field2184][var15][var16];
               var21 = -var17 + var18;
               var22 = var17 + var19 - var18 * 2;
               var23 = -var19 + var18 + -var20 + class505.field7191[class134.field2184][var15 + 2][var16];
               var14[var16] = (((float)var23 * var3 + (float)var22) * var3 + (float)var21) * var3 + (float)var20;
               ++var16;
            }
         }
      } catch (RuntimeException var30) {
         throw class612.method4503(var30, field11583[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "(ZII[B)V"
   )
   public final void method5730(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
      boolean var5 = client.field10022;

      try {
         ++field11564;
         if (!this.field11569) {
            if (this.field11574) {
               this.field11574 = false;
               throw new IOException();
            } else {
               if (this.field11565 == null) {
                  this.field11565 = new byte[this.field11577];
               }

               synchronized(this) {
                  if (!arg0) {
                     int var7 = 0;
                     if (var5) {
                        this.field11565[this.field11567] = arg3[arg1 + var7];
                        this.field11567 = (this.field11567 + 1) % this.field11577;
                        if (~this.field11567 == ~((this.field11578 + this.field11577 + -100) % this.field11577)) {
                           throw new IOException();
                        }

                        ++var7;
                     }

                     while(true) {
                        class796 var10000;
                        if (arg2 <= var7) {
                           var10000 = this;
                           if (!var5) {
                              if (this.field11580 == null) {
                                 this.field11580 = this.field11558.method883(3, this, -5);
                              }

                              this.notifyAll();
                              return;
                           }
                        } else {
                           this.field11565[this.field11567] = arg3[arg1 + var7];
                           this.field11567 = (this.field11567 + 1) % this.field11577;
                           var10000 = this;
                        }

                        if (~var10000.field11567 == ~((this.field11578 + this.field11577 + -100) % this.field11577)) {
                           throw new IOException();
                        }

                        ++var7;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field11583[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field11583[5] : field11583[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "(II[BI)V"
   )
   public final void method5731(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
      boolean var5 = client.field10022;

      try {
         ++field11571;
         if (!this.field11569) {
            while(true) {
               int var10000;
               if (~arg3 >= -1) {
                  var10000 = arg0;
                  if (!var5) {
                     if (arg0 < 67) {
                        method5729(83);
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = this.field11579.read(arg2, arg1, arg3);
               }

               int var6 = var10000;
               if (~var6 >= -1) {
                  throw new EOFException();
               }

               arg1 += var6;
               arg3 -= var6;
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field11583[13] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11583[5] : field11583[4]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method5732(int arg0, boolean arg1) {
      boolean var2 = client.field10022;

      try {
         label52: {
            if (~arg0 == -38) {
               class651.field9212 = 3.0F;
               if (!var2) {
                  break label52;
               }
            }

            if (~arg0 != -51) {
               if (arg0 != 75) {
                  if (arg0 == 100) {
                     class651.field9212 = 8.0F;
                     if (!var2) {
                        break label52;
                     }
                  }

                  if (arg0 != 200) {
                     break label52;
                  }

                  class651.field9212 = 16.0F;
                  if (!var2) {
                     break label52;
                  }
               }

               class651.field9212 = 6.0F;
               if (!var2) {
                  break label52;
               }
            }

            class651.field9212 = 4.0F;
         }

         class644.field9063 = -1;
         if (!arg1) {
            ++field11575;
            class644.field9063 = -1;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field11583[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method5733(int arg0) throws IOException {
      try {
         if (arg0 != 2000) {
            this.field11580 = null;
         }

         ++field11576;
         if (!this.field11569) {
            if (this.field11574) {
               this.field11574 = false;
               throw new IOException();
            }
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11583[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "(IJB)Lgfa;"
   )
   public static final class111 method5734(int arg0, long arg1, byte arg2) {
      try {
         if (arg2 > -101) {
            method5734(50, -112L, (byte)90);
         }

         ++field11562;
         class111 var4 = (class111)class630.field8964.method3101(-1, arg1 | (long)arg0 << 56);
         if (var4 == null) {
            var4 = new class111(arg0, arg1);
            class630.field8964.method3098(var4.field3777, var4, -1);
         }

         return var4;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field11583[15] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      try {
         ++field11568;
         this.method5728(true);
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field11583[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method5735(int arg0) {
      try {
         ++field11563;
         if (class467.field6773 != 0) {
            try {
               if (++class330.field4925 > 2000) {
                  label68: {
                     class745.field10604.method2114(0);
                     if (~class699.field10075 > -3) {
                        class432.field6349.method1415((byte)-80);
                        ++class699.field10075;
                        class330.field4925 = 0;
                        class467.field6773 = 1;
                        if (!client.field10022) {
                           break label68;
                        }
                     }

                     class617.field8766 = -5;
                     class467.field6773 = 0;
                     return;
                  }
               }

               if (class467.field6773 == 1) {
                  class745.field10604.field3707 = class432.field6349.method1416((byte)-4, class720.field10318);
                  class467.field6773 = 2;
               }

               if (class467.field6773 == 2) {
                  if (~class745.field10604.field3707.field1526 == -3) {
                     throw new IOException();
                  }

                  if (class745.field10604.field3707.field1526 != 1) {
                     return;
                  }

                  class745.field10604.field3713 = class150.method1461(0, 15000, (Socket)class745.field10604.field3707.field1525);
                  class745.field10604.field3707 = null;
                  class745.field10604.method2115((byte)0);
                  class467.field6773 = 4;
               }

               if (class467.field6773 == 4) {
                  if (class745.field10604.field3713.method2549(1, arg0 ^ 29841)) {
                     class745.field10604.field3713.method2551(1, 123, 0, class745.field10604.field3719.field942);
                     int var1 = class745.field10604.field3719.field942[0] & 255;
                     class467.field6773 = 0;
                     class617.field8766 = var1;
                     class745.field10604.method2114(arg0 ^ 3);
                  }
               } else if (arg0 == 3) {
                  ;
               }
            } catch (IOException var3) {
               class745.field10604.method2114(arg0 + -3);
               if (~class699.field10075 > -3) {
                  class432.field6349.method1415((byte)-16);
                  class330.field4925 = 0;
                  class467.field6773 = 1;
                  ++class699.field10075;
               } else {
                  class617.field8766 = -4;
                  class467.field6773 = 0;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field11583[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "<init>",
      descriptor = "(Ljava/net/Socket;Lfea;I)V"
   )
   public class796(Socket arg0, class82 arg1, int arg2) throws IOException {
      try {
         this.field11559 = arg0;
         this.field11558 = arg1;
         this.field11559.setSoTimeout(30000);
         this.field11559.setTcpNoDelay(true);
         this.field11579 = this.field11559.getInputStream();
         this.field11557 = this.field11559.getOutputStream();
         this.field11577 = arg2;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field11583[12] + (arg0 != null ? field11583[5] : field11583[4]) + ',' + (arg1 != null ? field11583[5] : field11583[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method5736(byte arg0) throws IOException {
      try {
         if (arg0 != -110) {
            return 97;
         } else {
            ++field11560;
            return this.field11569 ? 0 : this.field11579.available();
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11583[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      boolean var1 = client.field10022;

      try {
         ++field11572;

         try {
            label259:
            while(true) {
               synchronized(this){}

               Throwable var10000;
               boolean var10001;
               int var3;
               try {
                  if (this.field11578 == this.field11567) {
                     if (this.field11569) {
                        break;
                     }

                     try {
                        this.wait();
                     } catch (InterruptedException var27) {
                     }
                  }

                  var3 = this.field11578;
               } catch (Throwable var30) {
                  var10000 = var30;
                  var10001 = false;
                  throw var10000;
               }

               int var4;
               do {
                  try {
                     label242: {
                        if (~this.field11567 > ~this.field11578) {
                           var4 = -this.field11578 + this.field11577;
                           if (!var1) {
                              break label242;
                           }
                        }

                        var4 = -this.field11578 + this.field11567;
                     }
                  } catch (Throwable var29) {
                     var10000 = var29;
                     var10001 = false;
                     throw var10000;
                  }

                  if (var4 <= 0) {
                     continue label259;
                  }

                  try {
                     this.field11557.write(this.field11565, var3, var4);
                  } catch (IOException var28) {
                     this.field11574 = true;
                     break;
                  }
               } while(var1);

               this.field11578 = (this.field11578 + var4) % this.field11577;

               try {
                  if (this.field11578 == this.field11567) {
                     this.field11557.flush();
                  }
               } catch (IOException var26) {
                  this.field11574 = true;
               }
            }

            try {
               if (this.field11579 != null) {
                  this.field11579.close();
               }

               if (this.field11557 != null) {
                  this.field11557.close();
               }

               if (this.field11559 != null) {
                  this.field11559.close();
               }
            } catch (IOException var25) {
            }

            this.field11565 = null;
         } catch (Exception var31) {
            class117.method1138(-100, (String)null, var31);
         }
      } catch (RuntimeException var32) {
         throw class612.method4503(var32, field11583[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method5737(byte arg0) {
      try {
         ++field11573;
         if (arg0 >= 31) {
            if (!this.field11569) {
               this.field11579 = new class535();
               this.field11557 = new class512();
            }
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11583[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method5738(byte arg0) throws IOException {
      try {
         if (arg0 >= -99) {
            method5739(66);
         }

         ++field11561;
         return this.field11569 ? 0 : this.field11579.read();
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11583[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method5739(int arg0) {
      try {
         int var1 = -69 / ((74 - arg0) / 34);
         ++field11582;
         class448.field6532.method1052(true);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11583[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5740(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 109);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5741(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 106;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 109;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
