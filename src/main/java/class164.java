import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class164 {
   @OriginalMember(
      owner = "client!ev",
      name = "e",
      descriptor = "[J"
   )
   private long[] field2079 = new long[8];
   @OriginalMember(
      owner = "client!ev",
      name = "h",
      descriptor = "[J"
   )
   private long[] field2080 = new long[8];
   @OriginalMember(
      owner = "client!ev",
      name = "d",
      descriptor = "[J"
   )
   private long[] field2075 = new long[8];
   @OriginalMember(
      owner = "client!ev",
      name = "i",
      descriptor = "[B"
   )
   private byte[] field2078 = new byte[32];
   @OriginalMember(
      owner = "client!ev",
      name = "g",
      descriptor = "[J"
   )
   private long[] field2072 = new long[8];
   @OriginalMember(
      owner = "client!ev",
      name = "k",
      descriptor = "[B"
   )
   private byte[] field2081 = new byte[64];
   @OriginalMember(
      owner = "client!ev",
      name = "c",
      descriptor = "[J"
   )
   private long[] field2077 = new long[8];
   @OriginalMember(
      owner = "client!ev",
      name = "m",
      descriptor = "I"
   )
   private int field2082 = 0;
   @OriginalMember(
      owner = "client!ev",
      name = "a",
      descriptor = "I"
   )
   private int field2083 = 0;
   @OriginalMember(
      owner = "client!ev",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2085 = new String[]{method1364(method1363("Cyzhi")), method1364(method1363("Cyzoi")), method1364(method1363("]!z\u0005<")), method1364(method1363("j@\u0013b\u0002\u0006J\u0006y\u000et")), method1364(method1363("Hz8G")), method1364(method1363("Cyzii")), method1364(method1363("Cyzji"))};
   @OriginalMember(
      owner = "client!ev",
      name = "b",
      descriptor = "I"
   )
   public static int field2073;
   @OriginalMember(
      owner = "client!ev",
      name = "j",
      descriptor = "I"
   )
   public static int field2074;
   @OriginalMember(
      owner = "client!ev",
      name = "f",
      descriptor = "I"
   )
   public static int field2076;
   @OriginalMember(
      owner = "client!ev",
      name = "l",
      descriptor = "I"
   )
   public static int field2084;

   @OriginalMember(
      owner = "client!ev",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1359(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ev",
      name = "a",
      descriptor = "(I)V"
   )
   private final void method1360(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ev",
      name = "a",
      descriptor = "(I[BI)V"
   )
   public final void method1361(int arg0, byte[] arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         ++field2073;
         this.field2081[this.field2083] = (byte)class2.method15(this.field2081[this.field2083], 128 >>> class109.method974(this.field2082, 7));
         ++this.field2083;
         if (~this.field2083 < -33) {
            if (var4) {
               this.field2081[this.field2083++] = 0;
            }

            while(true) {
               class164 var10000;
               if (~this.field2083 <= -65) {
                  this.method1360(0);
                  var10000 = this;
                  if (!var4) {
                     this.field2083 = 0;
                     if (var4) {
                        this.field2081[this.field2083++] = 0;
                     }
                     break;
                  }
               } else {
                  var10000 = this;
               }

               var10000.field2081[this.field2083++] = 0;
            }
         }

         while(true) {
            while(~this.field2083 > -33) {
               this.field2081[this.field2083++] = 0;
            }

            byte[] var11 = this.field2078;
            if (!var4) {
               class349.method2762(var11, 0, this.field2081, 32, 32);
               if (arg2 <= 4) {
                  this.field2077 = null;
               }

               this.method1360(0);
               int var5 = 0;
               int var6 = arg0;
               if (!var4 && ~var5 <= -9) {
                  return;
               }

               do {
                  long var7 = this.field2075[var5];
                  arg1[var6] = (byte)((int)(var7 >>> 56));
                  arg1[var6 + 1] = (byte)((int)(var7 >>> 48));
                  arg1[var6 + 2] = (byte)((int)(var7 >>> 40));
                  arg1[var6 - -3] = (byte)((int)(var7 >>> 32));
                  arg1[var6 + 4] = (byte)((int)(var7 >>> 24));
                  arg1[var6 + 5] = (byte)((int)(var7 >>> 16));
                  arg1[var6 - -6] = (byte)((int)(var7 >>> 8));
                  arg1[var6 + 7] = (byte)((int)var7);
                  ++var5;
                  var6 += 8;
               } while(~var5 > -9);

               return;
            }

            var11[0] = 0;
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field2085[6] + arg0 + ',' + (arg1 != null ? field2085[2] : field2085[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ev",
      name = "a",
      descriptor = "(J[BB)V"
   )
   public final void method1362(long arg0, byte[] arg1, byte arg2) {
      boolean var5 = client.field1481;

      try {
         ++field2084;
         int var6 = 0;
         int var7 = 7 & 8 - (7 & (int)arg0);
         int var8 = 7 & this.field2082;
         long var9 = arg0;
         int var11 = 31;
         int var12 = 0;
         int var13 = -75 % ((arg2 - -41) / 57);
         int var14;
         if (var5) {
            var14 = (this.field2078[var11] & 255) + (255 & (int)arg0) + var12;
            this.field2078[var11] = (byte)var14;
            var9 = arg0 >>> 8;
            var12 = var14 >>> 8;
            --var11;
         }

         while(true) {
            while(var11 >= 0) {
               var14 = (this.field2078[var11] & 255) + (255 & (int)var9) + var12;
               this.field2078[var11] = (byte)var14;
               var9 >>>= 8;
               var12 = var14 >>> 8;
               --var11;
            }

            if (!var5) {
               int var15;
               if (var5) {
                  var15 = 255 & arg1[var6] << var7 | (arg1[var6 - -1] & 255) >>> -var7 + 8;
                  if (~var15 > -1 || ~var15 <= -257) {
                     throw new RuntimeException(field2085[3]);
                  }

                  this.field2081[this.field2083] = (byte)class2.method15(this.field2081[this.field2083], var15 >>> var8);
                  ++this.field2083;
                  this.field2082 += -var8 + 8;
                  if (~this.field2082 == -513) {
                     this.method1360(0);
                     this.field2082 = this.field2083 = 0;
                  }

                  this.field2081[this.field2083] = (byte)class109.method974(var15 << -var8 + 8, 255);
                  ++var6;
                  arg0 -= 8L;
                  this.field2082 += var8;
               }

               while(true) {
                  int var10000;
                  if (~arg0 >= -9L) {
                     long var19;
                     var10000 = (var19 = ~arg0 - -1L) == 0L ? 0 : (var19 < 0L ? -1 : 1);
                     if (!var5) {
                        int var16;
                        label51: {
                           if (var10000 >= 0) {
                              var16 = 0;
                              if (!var5) {
                                 break label51;
                              }
                           }

                           var16 = arg1[var6] << var7 & 255;
                           this.field2081[this.field2083] = (byte)class2.method15(this.field2081[this.field2083], var16 >>> var8);
                        }

                        if ((long)var8 + arg0 < 8L) {
                           this.field2082 = (int)((long)this.field2082 + arg0);
                           return;
                        }

                        arg0 -= (long)(-var8 + 8);
                        this.field2082 += -var8 + 8;
                        ++this.field2083;
                        if (this.field2082 == 512) {
                           this.method1360(0);
                           this.field2082 = this.field2083 = 0;
                        }

                        this.field2081[this.field2083] = (byte)class109.method974(255, var16 << -var8 + 8);
                        this.field2082 += (int)arg0;
                        return;
                     }
                  } else {
                     var10000 = 255 & arg1[var6] << var7 | (arg1[var6 - -1] & 255) >>> -var7 + 8;
                  }

                  var15 = var10000;
                  if (~var15 > -1 || ~var15 <= -257) {
                     throw new RuntimeException(field2085[3]);
                  }

                  this.field2081[this.field2083] = (byte)class2.method15(this.field2081[this.field2083], var15 >>> var8);
                  ++this.field2083;
                  this.field2082 += -var8 + 8;
                  if (~this.field2082 == -513) {
                     this.method1360(0);
                     this.field2082 = this.field2083 = 0;
                  }

                  this.field2081[this.field2083] = (byte)class109.method974(var15 << -var8 + 8, 255);
                  ++var6;
                  arg0 -= 8L;
                  this.field2082 += var8;
               }
            }

            --var11;
         }
      } catch (RuntimeException var18) {
         throw class93.method866(var18, field2085[1] + arg0 + ',' + (arg1 != null ? field2085[2] : field2085[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ev",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1363(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 65);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ev",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1364(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 38;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 65;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
