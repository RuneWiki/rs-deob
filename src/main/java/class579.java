import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class579 extends class532 {
   @OriginalMember(
      owner = "client!rca",
      name = "R",
      descriptor = "[[B"
   )
   private byte[][] field8553 = new byte[10][];
   @OriginalMember(
      owner = "client!rca",
      name = "U",
      descriptor = "Lica;"
   )
   private class354 field8557 = new class354((byte[])null);
   @OriginalMember(
      owner = "client!rca",
      name = "Q",
      descriptor = "Lica;"
   )
   private class354 field8564 = new class354((byte[])null);
   @OriginalMember(
      owner = "client!rca",
      name = "X",
      descriptor = "I"
   )
   private int field8561;
   @OriginalMember(
      owner = "client!rca",
      name = "Y",
      descriptor = "Lrr;"
   )
   private class678 field8554;
   @OriginalMember(
      owner = "client!rca",
      name = "Z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8565 = new String[]{method4340(method4339("\u00067ewN\\")), method4340(method4339("\u000fz*wp")), method4340(method4339("\u001a!h5")), method4340(method4339("\u00067ew1\u001d:m-3\\")), method4340(method4339("\u00067ewO\\")), method4340(method4339("\u00067ewL\\")), method4340(method4339("\u00067ewI\\"))};
   @OriginalMember(
      owner = "client!rca",
      name = "N",
      descriptor = "Lnaa;"
   )
   public static class113 field8555 = new class113(77, 3);
   @OriginalMember(
      owner = "client!rca",
      name = "O",
      descriptor = "I"
   )
   public static int field8556;
   @OriginalMember(
      owner = "client!rca",
      name = "T",
      descriptor = "I"
   )
   private int field8558;
   @OriginalMember(
      owner = "client!rca",
      name = "S",
      descriptor = "I"
   )
   public static int field8560;
   @OriginalMember(
      owner = "client!rca",
      name = "W",
      descriptor = "I"
   )
   public static int field8563;
   @OriginalMember(
      owner = "client!rca",
      name = "P",
      descriptor = "Ljava/lang/String;"
   )
   public static String field8559;
   @OriginalMember(
      owner = "client!rca",
      name = "V",
      descriptor = "[I"
   )
   private int[] field8562;

   @OriginalMember(
      owner = "client!rca",
      name = "a",
      descriptor = "(IIILfq;)V",
      line = 5
   )
   public static final void method4336(int arg0, int arg1, int arg2, class374 arg3) {
      try {
         ++field8556;
         class96 var4 = arg3.method3069(class351.field5356, (byte)-72);
         if (var4 != null) {
            label30: {
               class351.field5356.method629(arg2, arg1, arg3.field5849 + arg2, arg3.field5915 + arg1);
               if (class79.field1054 >= 3) {
                  class351.field5356.method654(-16777216, var4, arg2, arg1);
                  if (!client.field1786) {
                     break label30;
                  }
               }

               class127.field1828.method4957((float)arg3.field5849 / 2.0F + (float)arg2, (float)arg3.field5915 / 2.0F + (float)arg1, 4096, (16383 & (int)(-class417.field6456)) << 2, var4, arg2, arg1);
            }

            if (arg0 <= 102) {
               method4337((byte)-56);
            }
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field8565[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8565[1] : field8565[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "<init>",
      descriptor = "(ILrr;I)V",
      line = 36
   )
   public class579(int arg0, class678 arg1, int arg2) {
      super(arg0);

      try {
         this.field8561 = arg2;
         this.field8554 = arg1;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8565[3] + arg0 + ',' + (arg1 != null ? field8565[1] : field8565[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "a",
      descriptor = "([BB)I",
      line = 45
   )
   public final int method4089(byte[] arg0, byte arg1) throws IOException {
      boolean var3 = client.field1786;

      try {
         ++field8563;
         if (this.field8562 == null) {
            if (!this.field8554.method4994(0, 100, this.field8561)) {
               return 0;
            }

            byte[] var4 = this.field8554.method5017(this.field8561, 0, (byte)71);
            if (var4 == null) {
               throw new IllegalStateException("");
            }

            this.field8564.field5436 = 0;
            this.field8564.field5428 = var4;
            int var5 = var4.length >> 1;
            this.field8562 = new int[var5];
            int var6 = 0;
            if (var3 || ~var6 > ~var5) {
               do {
                  this.field8562[var6] = this.field8564.method2848(-111);
                  ++var6;
               } while(~var6 > ~var5);
            }
         }

         if (this.field8562.length <= this.field8558) {
            return -1;
         } else {
            this.method4338(125);
            this.field8564.field5428 = arg0;
            if (arg1 > -45) {
               return 64;
            } else {
               this.field8564.field5436 = 0;
               if (!var3 && this.field8564.field5436 >= this.field8564.field5428.length) {
                  this.field8564.field5428 = null;
                  return arg0.length;
               } else {
                  label88:
                  do {
                     if (this.field8557.field5428 == null) {
                        if (this.field8553[0] == null) {
                           this.field8564.field5428 = null;
                           return this.field8564.field5436;
                        }

                        this.field8557.field5428 = this.field8553[0];
                     }

                     int var7 = this.field8564.field5428.length + -this.field8564.field5436;
                     int var8 = this.field8557.field5428.length + -this.field8557.field5436;
                     int var10000 = ~var8;

                     do {
                        if (var10000 < ~var7) {
                           this.field8557.method2859(this.field8564.field5428, this.field8564.field5436, false, var7);
                           this.field8564.field5428 = null;
                           return arg0.length;
                        }

                        this.field8564.method2858(var8, 427497672, this.field8557.field5436, this.field8557.field5428);
                        this.field8557.field5436 = 0;
                        this.field8557.field5428 = null;
                        ++this.field8558;
                        int var9 = 0;
                        if (var3) {
                           this.field8553[var9] = this.field8553[var9 + 1];
                           ++var9;
                        }

                        while(true) {
                           class579 var12;
                           if (~var9 <= -10) {
                              this.field8553[9] = null;
                              var12 = this;
                              if (!var3) {
                                 if (~this.field8562.length < ~this.field8558) {
                                    continue label88;
                                 }

                                 this.field8564.field5428 = null;
                                 var10000 = this.field8564.field5436;
                                 break;
                              }
                           } else {
                              var12 = this;
                           }

                           var12.field8553[var9] = this.field8553[var9 + 1];
                           ++var9;
                        }
                     } while(var3);

                     return var10000;
                  } while(this.field8564.field5436 < this.field8564.field5428.length);

                  this.field8564.field5428 = null;
                  return arg0.length;
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field8565[4] + (arg0 != null ? field8565[1] : field8565[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "c",
      descriptor = "(B)V",
      line = 150
   )
   public static void method4337(byte arg0) {
      try {
         field8559 = null;
         if (arg0 <= 117) {
            method4336(40, -30, 14, (class374)null);
         }

         field8555 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8565[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "l",
      descriptor = "(I)V",
      line = 161
   )
   public final void method4338(int arg0) {
      boolean var2 = client.field1786;

      try {
         if (arg0 > 106) {
            ++field8560;
            if (this.field8562 != null) {
               int var3 = 0;
               if (!var2) {
                  if (~var3 <= -11) {
                     return;
                  }

                  if (var3 - -this.field8558 >= this.field8562.length) {
                     return;
                  }
               }

               do {
                  if (this.field8553[var3] == null && this.field8554.method4994(0, 100, this.field8562[this.field8558 - -var3])) {
                     this.field8553[var3] = this.field8554.method5017(this.field8562[this.field8558 + var3], 0, (byte)71);
                  }

                  ++var3;
                  if (~var3 <= -11) {
                     return;
                  }
               } while(var3 - -this.field8558 < this.field8562.length);

            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8565[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4339(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 13);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4340(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 84;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 89;
            break;
         default:
            var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
