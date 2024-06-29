import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class572 {
   @OriginalMember(
      owner = "client!fe",
      name = "d",
      descriptor = "[J"
   )
   private long[] field8463 = new long[8];
   @OriginalMember(
      owner = "client!fe",
      name = "i",
      descriptor = "[J"
   )
   private long[] field8467 = new long[8];
   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "[J"
   )
   private long[] field8471 = new long[8];
   @OriginalMember(
      owner = "client!fe",
      name = "m",
      descriptor = "[J"
   )
   private long[] field8473 = new long[8];
   @OriginalMember(
      owner = "client!fe",
      name = "b",
      descriptor = "I"
   )
   private int field8465 = 0;
   @OriginalMember(
      owner = "client!fe",
      name = "f",
      descriptor = "[B"
   )
   private byte[] field8472 = new byte[64];
   @OriginalMember(
      owner = "client!fe",
      name = "c",
      descriptor = "[J"
   )
   private long[] field8478 = new long[8];
   @OriginalMember(
      owner = "client!fe",
      name = "n",
      descriptor = "I"
   )
   private int field8479 = 0;
   @OriginalMember(
      owner = "client!fe",
      name = "q",
      descriptor = "[B"
   )
   private byte[] field8477 = new byte[32];
   @OriginalMember(
      owner = "client!fe",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8480 = new String[]{method4306(method4305("^{nAz")), method4306(method4305("C0n./")), method4306(method4305("K ,\u0003")), method4306(method4305("C0n,/")), method4306(method4305("C0n*/")), method4306(method4305("C0n+/")), method4306(method4305("C0n-/")), method4306(method4305("i\u001a\u0007&D\u0005\u0010\u0012=Hw"))};
   @OriginalMember(
      owner = "client!fe",
      name = "l",
      descriptor = "Llj;"
   )
   public static class304 field8466 = new class304(64);
   @OriginalMember(
      owner = "client!fe",
      name = "o",
      descriptor = "Lsn;"
   )
   public static class675 field8474 = new class675();
   @OriginalMember(
      owner = "client!fe",
      name = "p",
      descriptor = "I"
   )
   public static int field8464;
   @OriginalMember(
      owner = "client!fe",
      name = "k",
      descriptor = "I"
   )
   public static int field8468;
   @OriginalMember(
      owner = "client!fe",
      name = "e",
      descriptor = "I"
   )
   public static int field8469;
   @OriginalMember(
      owner = "client!fe",
      name = "h",
      descriptor = "I"
   )
   public static int field8470;
   @OriginalMember(
      owner = "client!fe",
      name = "g",
      descriptor = "I"
   )
   public static int field8475;
   @OriginalMember(
      owner = "client!fe",
      name = "j",
      descriptor = "I"
   )
   public static int field8476;

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(I)V",
      line = 7
   )
   public static void method4300(int arg0) {
      try {
         field8474 = null;
         if (arg0 != 8) {
            field8464 = -127;
         }

         field8466 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8480[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(JI[B)V",
      line = 23
   )
   public final void method4301(long arg0, int arg1, byte[] arg2) {
      boolean var5 = client.field1786;

      try {
         ++field8468;
         int var6 = 0;
         int var7 = arg1 - (7 & (int)arg0) & 7;
         int var8 = this.field8465 & 7;
         long var9 = arg0;
         int var11 = 31;
         int var12 = 0;
         int var13;
         if (var5) {
            var13 = (this.field8477[var11] & 255) + (255 & (int)arg0) + var12;
            this.field8477[var11] = (byte)var13;
            var9 = arg0 >>> 8;
            var12 = var13 >>> 8;
            --var11;
         }

         while(true) {
            while(~var11 <= -1) {
               var13 = (this.field8477[var11] & 255) + (255 & (int)var9) + var12;
               this.field8477[var11] = (byte)var13;
               var9 >>>= 8;
               var12 = var13 >>> 8;
               --var11;
            }

            if (!var5) {
               int var14;
               if (var5) {
                  var14 = 255 & arg2[var6] << var7 | (arg2[var6 + 1] & 255) >>> -var7 + 8;
                  if (var14 < 0 || ~var14 <= -257) {
                     throw new RuntimeException(field8480[7]);
                  }

                  this.field8472[this.field8479] = (byte)class119.method1087(this.field8472[this.field8479], var14 >>> var8);
                  this.field8465 += -var8 + 8;
                  ++this.field8479;
                  if (~this.field8465 == -513) {
                     this.method4303(-26318);
                     this.field8465 = this.field8479 = 0;
                  }

                  this.field8472[this.field8479] = (byte)class408.method3277(255, var14 << -var8 + 8);
                  ++var6;
                  arg0 -= 8L;
                  this.field8465 += var8;
               }

               while(true) {
                  int var10000;
                  if (~arg0 >= -9L) {
                     long var18;
                     var10000 = (var18 = arg0 - 0L) == 0L ? 0 : (var18 < 0L ? -1 : 1);
                     if (!var5) {
                        int var15;
                        label51: {
                           if (var10000 <= 0) {
                              var15 = 0;
                              if (!var5) {
                                 break label51;
                              }
                           }

                           var15 = arg2[var6] << var7 & 255;
                           this.field8472[this.field8479] = (byte)class119.method1087(this.field8472[this.field8479], var15 >>> var8);
                        }

                        if (~((long)var8 + arg0) <= -9L) {
                           arg0 -= (long)(-var8 + 8);
                           this.field8465 += 8 - var8;
                           ++this.field8479;
                           if (this.field8465 == 512) {
                              this.method4303(arg1 ^ -26310);
                              this.field8465 = this.field8479 = 0;
                           }

                           this.field8472[this.field8479] = (byte)class408.method3277(var15 << -var8 + 8, 255);
                           this.field8465 += (int)arg0;
                           return;
                        }

                        this.field8465 = (int)((long)this.field8465 + arg0);
                        return;
                     }
                  } else {
                     var10000 = 255 & arg2[var6] << var7 | (arg2[var6 + 1] & 255) >>> -var7 + 8;
                  }

                  var14 = var10000;
                  if (var14 < 0 || ~var14 <= -257) {
                     throw new RuntimeException(field8480[7]);
                  }

                  this.field8472[this.field8479] = (byte)class119.method1087(this.field8472[this.field8479], var14 >>> var8);
                  this.field8465 += -var8 + 8;
                  ++this.field8479;
                  if (~this.field8465 == -513) {
                     this.method4303(-26318);
                     this.field8465 = this.field8479 = 0;
                  }

                  this.field8472[this.field8479] = (byte)class408.method3277(255, var14 << -var8 + 8);
                  ++var6;
                  arg0 -= 8L;
                  this.field8465 += var8;
               }
            }

            --var11;
         }
      } catch (RuntimeException var17) {
         throw class482.method3757(var17, field8480[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8480[0] : field8480[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(Z)V",
      line = 108
   )
   public final void method4302(boolean arg0) {
      boolean var2 = client.field1786;

      try {
         ++field8476;
         int var3 = 0;
         if (var2) {
            this.field8477[var3] = 0;
            ++var3;
         }

         while(true) {
            while(var3 < 32) {
               this.field8477[var3] = 0;
               ++var3;
            }

            this.field8472[0] = 0;
            this.field8465 = this.field8479 = 0;
            int var4 = 0;
            if (!var2) {
               if (var2) {
                  this.field8467[var4] = 0L;
                  ++var4;
               }

               while(true) {
                  while(var4 < 8) {
                     this.field8467[var4] = 0L;
                     ++var4;
                  }

                  if (!var2) {
                     if (!arg0) {
                        this.field8465 = 80;
                        return;
                     }

                     return;
                  }

                  ++var4;
               }
            }

            ++var3;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field8480[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "b",
      descriptor = "(I)V",
      line = 134
   )
   private final void method4303(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(II[B)V",
      line = 245
   )
   public final void method4304(int arg0, int arg1, byte[] arg2) {
      boolean var4 = client.field1786;

      try {
         ++field8470;
         this.field8472[this.field8479] = (byte)class119.method1087(this.field8472[this.field8479], 128 >>> class408.method3277(this.field8465, 7));
         ++this.field8479;
         if (this.field8479 > 32) {
            if (var4) {
               this.field8472[this.field8479++] = 0;
            }

            while(true) {
               class572 var10000;
               if (this.field8479 >= 64) {
                  this.method4303(arg0 + -26323);
                  var10000 = this;
                  if (!var4) {
                     this.field8479 = 0;
                     if (var4) {
                        this.field8472[this.field8479++] = 0;
                     }
                     break;
                  }
               } else {
                  var10000 = this;
               }

               var10000.field8472[this.field8479++] = 0;
            }
         }

         while(~this.field8479 > -33) {
            this.field8472[this.field8479++] = 0;
         }

         if (arg0 != 5) {
            this.method4303(76);
         }

         class107.method1027(this.field8477, 0, this.field8472, 32, 32);
         this.method4303(-26318);
         int var5 = 0;
         int var6 = arg1;
         if (var4 || var5 < 8) {
            do {
               long var7 = this.field8467[var5];
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

         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field8480[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8480[0] : field8480[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4305(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fe",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4306(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 64;
            break;
         case 3:
            var10005 = 111;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
