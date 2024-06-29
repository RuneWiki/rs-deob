import jaggl.OpenGL;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class536 {
   @OriginalMember(
      owner = "client!dk",
      name = "e",
      descriptor = "I"
   )
   private int field7824 = 0;
   @OriginalMember(
      owner = "client!dk",
      name = "x",
      descriptor = "J"
   )
   private long field7831 = -1L;
   @OriginalMember(
      owner = "client!dk",
      name = "w",
      descriptor = "J"
   )
   private long field7842 = -1L;
   @OriginalMember(
      owner = "client!dk",
      name = "r",
      descriptor = "Lil;"
   )
   private class7 field7819;
   @OriginalMember(
      owner = "client!dk",
      name = "q",
      descriptor = "J"
   )
   private long field7823;
   @OriginalMember(
      owner = "client!dk",
      name = "u",
      descriptor = "J"
   )
   private long field7835;
   @OriginalMember(
      owner = "client!dk",
      name = "y",
      descriptor = "J"
   )
   private long field7818;
   @OriginalMember(
      owner = "client!dk",
      name = "o",
      descriptor = "[B"
   )
   private byte[] field7830;
   @OriginalMember(
      owner = "client!dk",
      name = "D",
      descriptor = "[B"
   )
   private byte[] field7843;
   @OriginalMember(
      owner = "client!dk",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7846 = new String[]{method3981(method3980("!\u0000H\nk")), method3981(method3980(">EHe>")), method3981(method3980("!\u0000Hw*+\u0002\u0012uk")), method3981(method3980("+\u001e\n'")), method3981(method3980("!\u0000H\u000ek")), method3981(method3980("!\u0000H\bk")), method3981(method3980("e\u0002\bk%,\u0007\u0003k")), method3981(method3980("\f\u0005\u0010*/,\u000fF8& \u0000F?,e")), method3981(method3980("!\u0000H\u0006k")), method3981(method3980("!\u0000H\rk")), method3981(method3980("!\u0000H\u0000k")), method3981(method3980("!\u0000H\fk")), method3981(method3980("\u0016\u0003\u0007/&7K\n\"-.\u0002\b,c#\n\u000f'&!Q")), method3981(method3980("!\u0000H\u0002k")), method3981(method3980("!\u0000H\tk")), method3981(method3980("\u0000\u0019\u0014$1\u007fK")), method3981(method3980("`[\u0007")), method3981(method3980("!\u0000H\u0003k")), method3981(method3980("!\u0000H\u0001k")), method3981(method3980("!\u0000H\u0007k"))};
   @OriginalMember(
      owner = "client!dk",
      name = "c",
      descriptor = "Lvh;"
   )
   public static class378 field7815 = new class378();
   @OriginalMember(
      owner = "client!dk",
      name = "F",
      descriptor = "I"
   )
   public static int field7826 = 0;
   @OriginalMember(
      owner = "client!dk",
      name = "j",
      descriptor = "Lsda;"
   )
   public static class269 field7825 = new class269(15, 8);
   @OriginalMember(
      owner = "client!dk",
      name = "m",
      descriptor = "Lcj;"
   )
   public static class721 field7839 = new class721(9, 0, 4, 1);
   @OriginalMember(
      owner = "client!dk",
      name = "v",
      descriptor = "Lsda;"
   )
   public static class269 field7841 = new class269(6, 11);
   @OriginalMember(
      owner = "client!dk",
      name = "t",
      descriptor = "F"
   )
   public static float field7844;
   @OriginalMember(
      owner = "client!dk",
      name = "z",
      descriptor = "I"
   )
   public static int field7816;
   @OriginalMember(
      owner = "client!dk",
      name = "n",
      descriptor = "I"
   )
   public static int field7817;
   @OriginalMember(
      owner = "client!dk",
      name = "f",
      descriptor = "I"
   )
   public static int field7820;
   @OriginalMember(
      owner = "client!dk",
      name = "i",
      descriptor = "I"
   )
   public static int field7821;
   @OriginalMember(
      owner = "client!dk",
      name = "p",
      descriptor = "I"
   )
   public static int field7822;
   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "I"
   )
   public static int field7827;
   @OriginalMember(
      owner = "client!dk",
      name = "E",
      descriptor = "I"
   )
   public static int field7829;
   @OriginalMember(
      owner = "client!dk",
      name = "l",
      descriptor = "I"
   )
   public static int field7832;
   @OriginalMember(
      owner = "client!dk",
      name = "k",
      descriptor = "I"
   )
   private int field7833;
   @OriginalMember(
      owner = "client!dk",
      name = "h",
      descriptor = "I"
   )
   public static int field7834;
   @OriginalMember(
      owner = "client!dk",
      name = "g",
      descriptor = "I"
   )
   public static int field7836;
   @OriginalMember(
      owner = "client!dk",
      name = "b",
      descriptor = "I"
   )
   public static int field7838;
   @OriginalMember(
      owner = "client!dk",
      name = "B",
      descriptor = "I"
   )
   public static int field7840;
   @OriginalMember(
      owner = "client!dk",
      name = "A",
      descriptor = "J"
   )
   private long field7837;
   @OriginalMember(
      owner = "client!dk",
      name = "d",
      descriptor = "Ldg;"
   )
   public static class432 field7828;
   @OriginalMember(
      owner = "client!dk",
      name = "s",
      descriptor = "Lhea;"
   )
   public static class445 field7845;

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(I)V"
   )
   private final void method3967(int arg0) throws IOException {
      int var2 = client.field4530;

      try {
         this.field7833 = 0;
         ++field7817;
         if (arg0 < 68) {
            this.field7824 = 54;
         }

         if (this.field7837 != this.field7818) {
            this.field7819.method66(-1, this.field7818);
            this.field7837 = this.field7818;
         }

         this.field7831 = this.field7818;
         if (var2 != 0 || ~this.field7833 > ~this.field7830.length) {
            do {
               int var3 = this.field7830.length + -this.field7833;
               if (var3 > 200000000) {
                  var3 = 200000000;
               }

               int var4 = this.field7819.method58(true, this.field7830, this.field7833, var3);
               if (var4 == -1) {
                  break;
               }

               this.field7833 += var4;
               this.field7837 += (long)var4;
            } while(~this.field7833 > ~this.field7830.length);
         }

      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field7846[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(IJ)V"
   )
   public final void method3968(int arg0, long arg1) throws IOException {
      try {
         ++field7827;
         if (arg1 < 0L) {
            throw new IOException(field7846[7] + arg1 + field7846[6] + this.method3979(19442));
         } else {
            if (arg0 > -85) {
               method3972((class429[])null, (class379)null, -3);
            }

            this.field7818 = arg1;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7846[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3969(int arg0) {
      try {
         field7828 = null;
         field7825 = null;
         field7841 = null;
         field7845 = null;
         field7815 = null;
         field7839 = null;
         if (arg0 != 0) {
            field7845 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7846[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(ILjava/lang/String;)V"
   )
   public static final void method3970(int arg0, String arg1) {
      if (arg0 == -1) {
         System.out.println(field7846[15] + class538.method3987("\n", arg1, (byte)-72, field7846[16]));
         ++field7822;
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "b",
      descriptor = "(I)V"
   )
   private final void method3971(int arg0) throws IOException {
      int var2 = client.field4530;

      try {
         if (arg0 < 103) {
            this.field7831 = -8L;
         }

         ++field7838;
         if (~this.field7842 != 0L) {
            if (~this.field7842 != ~this.field7837) {
               this.field7819.method66(-1, this.field7842);
               this.field7837 = this.field7842;
            }

            this.field7819.method62(this.field7843, 0, (byte)-35, this.field7824);
            this.field7837 += (long)this.field7824;
            if (this.field7823 < this.field7837) {
               this.field7823 = this.field7837;
            }

            long var3;
            label78: {
               var3 = -1L;
               if (~this.field7831 < ~this.field7842 || this.field7842 >= this.field7831 - -((long)this.field7833)) {
                  if (this.field7831 < this.field7842 || ~this.field7831 <= ~((long)this.field7824 + this.field7842)) {
                     break label78;
                  }

                  var3 = this.field7831;
                  if (var2 == 0) {
                     break label78;
                  }
               }

               var3 = this.field7842;
            }

            long var5;
            label52: {
               var5 = -1L;
               if (~((long)this.field7824 + this.field7842) < ~this.field7831 && ~(this.field7831 - -((long)this.field7833)) <= ~(this.field7842 - -((long)this.field7824))) {
                  var5 = this.field7842 - -((long)this.field7824);
                  if (var2 == 0) {
                     break label52;
                  }
               }

               if ((long)this.field7833 + this.field7831 > this.field7842 && ~((long)this.field7824 + this.field7842) <= ~((long)this.field7833 + this.field7831)) {
                  var5 = (long)this.field7833 + this.field7831;
               }
            }

            if (~var3 < 0L && var5 > var3) {
               int var7 = (int)(-var3 + var5);
               class195.method1492(this.field7843, (int)(-this.field7842 + var3), this.field7830, (int)(var3 - this.field7831), var7);
            }

            this.field7842 = -1L;
            this.field7824 = 0;
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field7846[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "([Lwl;Leh;I)Ljt;"
   )
   public static final class112 method3972(class429[] arg0, class379 arg1, int arg2) {
      int var3 = client.field4530;

      try {
         ++field7829;
         int var4 = arg2;
         if (var3 != 0) {
            if (arg0[arg2] == null || ~arg0[arg2].field6555 >= -1L) {
               return null;
            }

            var4 = arg2 + 1;
         }

         while(true) {
            if (var4 >= arg0.length) {
               long var5 = OpenGL.glCreateProgramObjectARB();
               int var7 = 0;
               if (var3 != 0) {
                  break;
               }

               if (var3 != 0) {
                  OpenGL.glAttachObjectARB(var5, arg0[var7].field6555);
                  ++var7;
               }

               while(true) {
                  while(arg0.length > var7) {
                     OpenGL.glAttachObjectARB(var5, arg0[var7].field6555);
                     ++var7;
                  }

                  OpenGL.glLinkProgramARB(var5);
                  OpenGL.glGetObjectParameterivARB(var5, 35714, class31.field343, 0);
                  if (var3 == 0) {
                     if (~class31.field343[0] == -1) {
                        if (class31.field343[0] == 0) {
                           System.out.println(field7846[12]);
                        }

                        OpenGL.glGetObjectParameterivARB(var5, 35716, class31.field343, 1);
                        if (class31.field343[1] > 1) {
                           byte[] var8 = new byte[class31.field343[1]];
                           OpenGL.glGetInfoLogARB(var5, class31.field343[1], class31.field343, 0, var8, 0);
                           System.out.println(new String(var8));
                        }

                        if (~class31.field343[0] == -1) {
                           int var9 = 0;
                           if (var3 != 0) {
                              OpenGL.glDetachObjectARB(var5, arg0[var9].field6555);
                              ++var9;
                           }

                           while(true) {
                              while(var9 < arg0.length) {
                                 OpenGL.glDetachObjectARB(var5, arg0[var9].field6555);
                                 ++var9;
                              }

                              OpenGL.glDeleteObjectARB(var5);
                              if (var3 == 0) {
                                 return null;
                              }

                              ++var9;
                           }
                        }
                     }

                     return new class112(arg1, var5, arg0);
                  }

                  ++var7;
               }
            }

            if (arg0[var4] == null || ~arg0[var4].field6555 >= -1L) {
               break;
            }

            ++var4;
         }

         return null;
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field7846[13] + (arg0 != null ? field7846[1] : field7846[3]) + ',' + (arg1 != null ? field7846[1] : field7846[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method3973(boolean arg0) throws IOException {
      try {
         this.method3971(125);
         ++field7834;
         this.field7819.method60(arg0);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7846[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(BII[B)V"
   )
   public final void method3974(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
      int var5 = client.field4530;

      try {
         ++field7820;

         try {
            if (~(arg1 + arg2) < ~arg3.length) {
               throw new ArrayIndexOutOfBoundsException(-arg3.length + arg1 + arg2);
            }

            if (this.field7842 != -1L && this.field7842 <= this.field7818 && ~((long)this.field7824 + this.field7842) <= ~((long)arg1 + this.field7818)) {
               class195.method1492(this.field7843, (int)(-this.field7842 + this.field7818), arg3, arg2, arg1);
               this.field7818 += (long)arg1;
               return;
            }

            long var6 = this.field7818;
            int var8 = arg2;
            int var9 = arg1;
            if (arg0 < 48) {
               this.field7842 = 19L;
            }

            if (this.field7818 >= this.field7831 && (long)this.field7833 + this.field7831 > this.field7818) {
               int var10 = (int)((long)this.field7833 + this.field7831 + -this.field7818);
               if (var10 > arg1) {
                  var10 = arg1;
               }

               class195.method1492(this.field7830, (int)(-this.field7831 + this.field7818), arg3, arg2, var10);
               arg2 += var10;
               this.field7818 += (long)var10;
               arg1 -= var10;
            }

            label160: {
               if (arg1 > this.field7830.length) {
                  this.field7819.method66(-1, this.field7818);
                  this.field7837 = this.field7818;
                  if (var5 != 0 || ~arg1 < -1) {
                     do {
                        int var11 = this.field7819.method58(true, arg3, arg2, arg1);
                        if (~var11 == 0) {
                           break;
                        }

                        this.field7818 += (long)var11;
                        arg2 += var11;
                        this.field7837 += (long)var11;
                        arg1 -= var11;
                     } while(~arg1 < -1);
                  }

                  if (var5 == 0) {
                     break label160;
                  }
               }

               if (arg1 > 0) {
                  this.method3967(86);
                  int var12 = arg1;
                  if (~this.field7833 > ~arg1) {
                     var12 = this.field7833;
                  }

                  class195.method1492(this.field7830, 0, arg3, arg2, var12);
                  arg1 -= var12;
                  arg2 += var12;
                  this.field7818 += (long)var12;
               }
            }

            if (~this.field7842 != 0L) {
               if (this.field7842 > this.field7818 && ~arg1 < -1) {
                  label178: {
                     int var13 = (int)(-this.field7818 + this.field7842) + arg2;
                     if (~(arg2 - -arg1) > ~var13) {
                        var13 = arg1 + arg2;
                        if (var5 == 0 && var13 <= arg2) {
                           break label178;
                        }
                     } else if (var13 <= arg2) {
                        break label178;
                     }

                     do {
                        --arg1;
                        arg3[arg2++] = 0;
                        ++this.field7818;
                     } while(var13 > arg2);
                  }
               }

               long var14;
               label116: {
                  var14 = -1L;
                  if (~this.field7842 <= ~var6 && ~this.field7842 > ~((long)var9 + var6)) {
                     var14 = this.field7842;
                     if (var5 == 0) {
                        break label116;
                     }
                  }

                  if (~var6 <= ~this.field7842 && ~var6 > ~((long)this.field7824 + this.field7842)) {
                     var14 = var6;
                  }
               }

               long var16;
               label185: {
                  var16 = -1L;
                  if (var6 >= (long)this.field7824 + this.field7842 || (long)var9 + var6 < this.field7842 - -((long)this.field7824)) {
                     if (var6 - -((long)var9) <= this.field7842 || ~((long)var9 + var6) < ~(this.field7842 - -((long)this.field7824))) {
                        break label185;
                     }

                     var16 = (long)var9 + var6;
                     if (var5 == 0) {
                        break label185;
                     }
                  }

                  var16 = this.field7842 - -((long)this.field7824);
               }

               if (~var14 < 0L && ~var14 > ~var16) {
                  int var18 = (int)(-var14 + var16);
                  class195.method1492(this.field7843, (int)(-this.field7842 + var14), arg3, var8 - -((int)(var14 - var6)), var18);
                  if (~var16 < ~this.field7818) {
                     arg1 = (int)((long)arg1 - (-this.field7818 + var16));
                     this.field7818 = var16;
                  }
               }
            }
         } catch (IOException var21) {
            this.field7837 = -1L;
            throw var21;
         }

         if (~arg1 < -1) {
            throw new EOFException();
         }
      } catch (RuntimeException var22) {
         throw class670.method4877(var22, field7846[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7846[1] : field7846[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "([BZ)V"
   )
   public final void method3975(byte[] arg0, boolean arg1) throws IOException {
      try {
         if (arg1) {
            method3970(-43, (String)null);
         }

         ++field7821;
         this.method3974((byte)103, arg0.length, 0, arg0);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7846[14] + (arg0 != null ? field7846[1] : field7846[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(B)J"
   )
   public final long method3976(byte arg0) {
      try {
         ++field7816;
         int var2 = 26 % ((arg0 - -47) / 35);
         return this.field7835;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7846[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "([BIBI)V"
   )
   public final void method3977(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
      int var5 = client.field4530;

      try {
         ++field7832;

         try {
            if (~this.field7835 > ~((long)arg1 + this.field7818)) {
               this.field7835 = (long)arg1 + this.field7818;
            }

            if (~this.field7842 != 0L && (this.field7818 < this.field7842 || ~((long)this.field7824 + this.field7842) > ~this.field7818)) {
               this.method3971(105);
            }

            if (this.field7842 != -1L && ~((long)arg1 + this.field7818) < ~((long)this.field7843.length + this.field7842)) {
               int var6 = (int)(this.field7842 - this.field7818 + (long)this.field7843.length);
               class195.method1492(arg0, arg3, this.field7843, (int)(-this.field7842 + this.field7818), var6);
               arg3 += var6;
               this.field7818 += (long)var6;
               arg1 -= var6;
               this.field7824 = this.field7843.length;
               this.method3971(122);
            }

            if (this.field7843.length >= arg1) {
               if (~arg1 < -1) {
                  if (~this.field7842 == 0L) {
                     this.field7842 = this.field7818;
                  }

                  class195.method1492(arg0, arg3, this.field7843, (int)(-this.field7842 + this.field7818), arg1);
                  this.field7818 += (long)arg1;
                  if (~(this.field7818 - this.field7842) < ~((long)this.field7824)) {
                     this.field7824 = (int)(-this.field7842 + this.field7818);
                  }

               } else if (arg2 > -86) {
                  field7845 = null;
               }
            } else {
               if (~this.field7837 != ~this.field7818) {
                  this.field7819.method66(-1, this.field7818);
                  this.field7837 = this.field7818;
               }

               this.field7819.method62(arg0, arg3, (byte)-35, arg1);
               this.field7837 += (long)arg1;
               if (~this.field7837 < ~this.field7823) {
                  this.field7823 = this.field7837;
               }

               long var7;
               label99: {
                  var7 = -1L;
                  if (this.field7818 >= this.field7831 && ~((long)this.field7833 + this.field7831) < ~this.field7818) {
                     var7 = this.field7818;
                     if (var5 == 0) {
                        break label99;
                     }
                  }

                  if (this.field7831 >= this.field7818 && ~this.field7831 > ~((long)arg1 + this.field7818)) {
                     var7 = this.field7831;
                  }
               }

               long var9;
               label93: {
                  var9 = -1L;
                  if (this.field7831 < this.field7818 - -((long)arg1) && ~(this.field7831 - -((long)this.field7833)) <= ~((long)arg1 + this.field7818)) {
                     var9 = this.field7818 - -((long)arg1);
                     if (var5 == 0) {
                        break label93;
                     }
                  }

                  if (this.field7818 < this.field7831 - -((long)this.field7833) && ~((long)this.field7833 + this.field7831) >= ~((long)arg1 + this.field7818)) {
                     var9 = (long)this.field7833 + this.field7831;
                  }
               }

               if (~var7 < 0L && var9 > var7) {
                  int var11 = (int)(-var7 + var9);
                  class195.method1492(arg0, (int)((long)arg3 + var7 - this.field7818), this.field7830, (int)(-this.field7831 + var7), var11);
               }

               this.field7818 += (long)arg1;
            }
         } catch (IOException var14) {
            this.field7837 = -1L;
            throw var14;
         }
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field7846[18] + (arg0 != null ? field7846[1] : field7846[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(ZLha;)V"
   )
   public static final void method3978(boolean arg0, class66 arg1) {
      int var2 = client.field4530;

      try {
         ++field7840;
         class382.field5863 = new class407[class442.field6740.length];
         if (!arg0) {
            int var3 = 0;
            if (var2 != 0 || ~var3 > ~class442.field6740.length) {
               do {
                  int var4 = class442.field6740[var3];
                  class763 var5 = class145.method1203((byte)79, class97.field1198, var4);
                  class67 var6 = arg1.method570(var5, class671.method4884(class54.field620, var4), true);
                  class382.field5863[var3] = new class407(var6, var5);
                  ++var3;
               } while(~var3 > ~class442.field6740.length);

            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field7846[17] + arg0 + ',' + (arg1 != null ? field7846[1] : field7846[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "d",
      descriptor = "(I)Ljava/io/File;"
   )
   private final File method3979(int arg0) {
      try {
         ++field7836;
         if (arg0 != 19442) {
            method3978(false, (class66)null);
         }

         return this.field7819.method64((byte)89);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7846[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "<init>",
      descriptor = "(Lil;II)V"
   )
   public class536(class7 arg0, int arg1, int arg2) throws IOException {
      try {
         this.field7819 = arg0;
         this.field7835 = this.field7823 = arg0.method65(false);
         this.field7818 = 0L;
         this.field7830 = new byte[arg1];
         this.field7843 = new byte[arg2];
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7846[2] + (arg0 != null ? field7846[1] : field7846[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3980(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3981(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
