import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class385 {
   @OriginalMember(
      owner = "client!mn",
      name = "l",
      descriptor = "[J"
   )
   private long[] field5879 = new long[8];
   @OriginalMember(
      owner = "client!mn",
      name = "g",
      descriptor = "I"
   )
   private int field5884 = 0;
   @OriginalMember(
      owner = "client!mn",
      name = "h",
      descriptor = "[J"
   )
   private long[] field5885 = new long[8];
   @OriginalMember(
      owner = "client!mn",
      name = "c",
      descriptor = "[J"
   )
   private long[] field5882 = new long[8];
   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "[J"
   )
   private long[] field5890 = new long[8];
   @OriginalMember(
      owner = "client!mn",
      name = "i",
      descriptor = "[B"
   )
   private byte[] field5888 = new byte[32];
   @OriginalMember(
      owner = "client!mn",
      name = "d",
      descriptor = "I"
   )
   private int field5881 = 0;
   @OriginalMember(
      owner = "client!mn",
      name = "e",
      descriptor = "[B"
   )
   private byte[] field5889 = new byte[64];
   @OriginalMember(
      owner = "client!mn",
      name = "n",
      descriptor = "[J"
   )
   private long[] field5891 = new long[8];
   @OriginalMember(
      owner = "client!mn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5893 = new String[]{method2962(method2961("\u0015eAly")), method2962(method2961("\u0016~\u0003C")), method2962(method2961("\u0015eAny")), method2962(method2961("\u0003%A\u0001,")), method2962(method2961("\u0015eAjy")), method2962(method2961("\u0015eAky")), method2962(method2961("4D(f\u0012XN=}\u001e*")), method2962(method2961("\u0015eAmy"))};
   @OriginalMember(
      owner = "client!mn",
      name = "b",
      descriptor = "I"
   )
   public static int field5880;
   @OriginalMember(
      owner = "client!mn",
      name = "k",
      descriptor = "I"
   )
   public static int field5883;
   @OriginalMember(
      owner = "client!mn",
      name = "m",
      descriptor = "I"
   )
   public static int field5886;
   @OriginalMember(
      owner = "client!mn",
      name = "j",
      descriptor = "I"
   )
   public static int field5887;
   @OriginalMember(
      owner = "client!mn",
      name = "f",
      descriptor = "I"
   )
   public static int field5892;

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(J[BB)V"
   )
   public final void method2956(long arg0, byte[] arg1, byte arg2) {
      int var5 = client.field4530;

      try {
         ++field5883;
         int var6 = 0;
         int var7 = 7 & -(7 & (int)arg0) + 8;
         int var8 = 7 & this.field5884;
         long var9 = arg0;
         int var11 = 31;
         int var12 = -69 % ((-54 - arg2) / 56);
         int var13 = 0;
         int var14;
         if (var5 != 0) {
            var14 = (255 & this.field5888[var11]) + ((int)arg0 & 255) + var13;
            this.field5888[var11] = (byte)var14;
            var13 = var14 >>> 8;
            var9 = arg0 >>> 8;
            --var11;
         }

         while(true) {
            while(~var11 <= -1) {
               var14 = (255 & this.field5888[var11]) + ((int)var9 & 255) + var13;
               this.field5888[var11] = (byte)var14;
               var13 = var14 >>> 8;
               var9 >>>= 8;
               --var11;
            }

            if (var5 == 0) {
               int var15;
               if (var5 != 0) {
                  var15 = arg1[var6] << var7 & 255 | (255 & arg1[var6 - -1]) >>> -var7 + 8;
                  if (var15 < 0 || ~var15 <= -257) {
                     throw new RuntimeException(field5893[6]);
                  }

                  this.field5889[this.field5881] = (byte)class379.method2928(this.field5889[this.field5881], var15 >>> var8);
                  this.field5884 += 8 - var8;
                  ++this.field5881;
                  if (this.field5884 == 512) {
                     this.method2958((byte)-24);
                     this.field5884 = this.field5881 = 0;
                  }

                  this.field5889[this.field5881] = (byte)class153.method1262(255, var15 << -var8 + 8);
                  this.field5884 += var8;
                  arg0 -= 8L;
                  ++var6;
               }

               while(true) {
                  int var10000;
                  if (arg0 <= 8L) {
                     long var19;
                     var10000 = (var19 = ~arg0 - -1L) == 0L ? 0 : (var19 < 0L ? -1 : 1);
                     if (var5 == 0) {
                        int var16;
                        label51: {
                           if (var10000 >= 0) {
                              var16 = 0;
                              if (var5 == 0) {
                                 break label51;
                              }
                           }

                           var16 = arg1[var6] << var7 & 255;
                           this.field5889[this.field5881] = (byte)class379.method2928(this.field5889[this.field5881], var16 >>> var8);
                        }

                        if ((long)var8 + arg0 >= 8L) {
                           ++this.field5881;
                           this.field5884 += 8 - var8;
                           arg0 -= (long)(8 - var8);
                           if (~this.field5884 == -513) {
                              this.method2958((byte)-6);
                              this.field5884 = this.field5881 = 0;
                           }

                           this.field5889[this.field5881] = (byte)class153.method1262(var16 << -var8 + 8, 255);
                           this.field5884 += (int)arg0;
                           return;
                        }

                        this.field5884 = (int)((long)this.field5884 + arg0);
                        return;
                     }
                  } else {
                     var10000 = arg1[var6] << var7 & 255 | (255 & arg1[var6 - -1]) >>> -var7 + 8;
                  }

                  var15 = var10000;
                  if (var15 < 0 || ~var15 <= -257) {
                     throw new RuntimeException(field5893[6]);
                  }

                  this.field5889[this.field5881] = (byte)class379.method2928(this.field5889[this.field5881], var15 >>> var8);
                  this.field5884 += 8 - var8;
                  ++this.field5881;
                  if (this.field5884 == 512) {
                     this.method2958((byte)-24);
                     this.field5884 = this.field5881 = 0;
                  }

                  this.field5889[this.field5881] = (byte)class153.method1262(255, var15 << -var8 + 8);
                  this.field5884 += var8;
                  arg0 -= 8L;
                  ++var6;
               }
            }

            --var11;
         }
      } catch (RuntimeException var18) {
         throw class670.method4877(var18, field5893[5] + arg0 + ',' + (arg1 != null ? field5893[3] : field5893[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(IIZIIIILha;)V"
   )
   public static final void method2957(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, class66 arg7) {
      try {
         ++field5880;
         class616.field9011 = arg7;
         class283.field3939 = class616.field9011.method559();
         class681.field10231 = class616.field9011.method559();
         class280.field3897 = class616.field9011.method559();
         class4.field85 = 1;
         class580.field8592 = 0;
         class362.field5457 = arg3;
         class665.field9665 = 0;
         class232.field2956 = null;
         class232.field2945 = arg5;
         if (!arg2) {
            class186.field2315 = arg4;
            class519.field7557 = arg6;
            class785.method5640(arg1, -18, arg0);
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field5893[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field5893[3] : field5893[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(B)V"
   )
   private final void method2958(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2959(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(I[BI)V"
   )
   public final void method2960(int arg0, byte[] arg1, int arg2) {
      int var4 = client.field4530;

      try {
         this.field5889[this.field5881] = (byte)class379.method2928(this.field5889[this.field5881], 128 >>> class153.method1262(7, this.field5884));
         ++field5886;
         ++this.field5881;
         class385 var10000;
         if (~this.field5881 < -33) {
            if (var4 != 0) {
               this.field5889[this.field5881++] = 0;
            }

            while(true) {
               if (~this.field5881 <= -65) {
                  this.method2958((byte)-83);
                  var10000 = this;
                  if (var4 == 0) {
                     this.field5881 = 0;
                     break;
                  }
               } else {
                  var10000 = this;
               }

               var10000.field5889[this.field5881++] = 0;
            }
         }

         if (arg0 != 19440) {
            this.method2956(-16L, (byte[])null, (byte)54);
            if (var4 != 0) {
               this.field5889[this.field5881++] = 0;
            }
         }

         while(true) {
            if (this.field5881 >= 32) {
               class195.method1492(this.field5888, 0, this.field5889, 32, 32);
               var10000 = this;
               if (var4 == 0) {
                  this.method2958((byte)-120);
                  int var5 = 0;
                  int var6 = arg2;
                  if (var4 == 0 && var5 >= 8) {
                     return;
                  } else {
                     do {
                        long var7 = this.field5885[var5];
                        arg1[var6] = (byte)((int)(var7 >>> 56));
                        arg1[var6 + 1] = (byte)((int)(var7 >>> 48));
                        arg1[var6 + 2] = (byte)((int)(var7 >>> 40));
                        arg1[var6 + 3] = (byte)((int)(var7 >>> 32));
                        arg1[var6 + 4] = (byte)((int)(var7 >>> 24));
                        arg1[var6 + 5] = (byte)((int)(var7 >>> 16));
                        arg1[var6 - -6] = (byte)((int)(var7 >>> 8));
                        arg1[var6 - -7] = (byte)((int)var7);
                        ++var5;
                        var6 += 8;
                     } while(var5 < 8);

                     return;
                  }
               }
            } else {
               var10000 = this;
            }

            var10000.field5889[this.field5881++] = 0;
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field5893[7] + arg0 + ',' + (arg1 != null ? field5893[3] : field5893[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2961(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2962(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 47;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
