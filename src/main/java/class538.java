import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class538 extends class548 {
   @OriginalMember(
      owner = "client!ij",
      name = "K",
      descriptor = "[[B"
   )
   private byte[][] field7564 = new byte[10][];
   @OriginalMember(
      owner = "client!ij",
      name = "H",
      descriptor = "Lcu;"
   )
   private class65 field7561 = new class65((byte[])null);
   @OriginalMember(
      owner = "client!ij",
      name = "G",
      descriptor = "Lcu;"
   )
   private class65 field7567 = new class65((byte[])null);
   @OriginalMember(
      owner = "client!ij",
      name = "M",
      descriptor = "I"
   )
   private int field7562;
   @OriginalMember(
      owner = "client!ij",
      name = "F",
      descriptor = "Lsa;"
   )
   private class39 field7560;
   @OriginalMember(
      owner = "client!ij",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7568 = new String[]{method4013(method4012("sdr;c")), method4013(method4012("a rG6")), method4013(method4012("t{0\u0005")), method4013(method4012("sdr-c")), method4013(method4012("sdrU\"tg(Wc"))};
   @OriginalMember(
      owner = "client!ij",
      name = "E",
      descriptor = "I"
   )
   private int field7563;
   @OriginalMember(
      owner = "client!ij",
      name = "I",
      descriptor = "I"
   )
   public static int field7565;
   @OriginalMember(
      owner = "client!ij",
      name = "J",
      descriptor = "I"
   )
   public static int field7566;
   @OriginalMember(
      owner = "client!ij",
      name = "L",
      descriptor = "[I"
   )
   private int[] field7559;

   @OriginalMember(
      owner = "client!ij",
      name = "i",
      descriptor = "(I)V"
   )
   public final void method4010(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field7565;
         if (this.field7559 != null) {
            int var10000;
            int var10001;
            label55: {
               label54: {
                  int var3 = 0;
                  if (!var2) {
                     if (~var3 <= -11) {
                        break label54;
                     }

                     var10000 = this.field7559.length;
                     var10001 = this.field7563 + var3;
                     if (var2) {
                        break label55;
                     }

                     if (var10000 <= var10001) {
                        break label54;
                     }
                  }

                  do {
                     if (this.field7564[var3] == null && this.field7560.method442(true, 0, this.field7559[this.field7563 + var3])) {
                        this.field7564[var3] = this.field7560.method460((byte)-11, 0, this.field7559[this.field7563 - -var3]);
                     }

                     ++var3;
                     if (~var3 <= -11) {
                        break;
                     }

                     var10000 = this.field7559.length;
                     var10001 = this.field7563 + var3;
                     if (var2) {
                        break label55;
                     }
                  } while(var10000 > var10001);
               }

               var10000 = arg0;
               var10001 = 95;
            }

            if (var10000 < var10001) {
               this.field7561 = null;
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field7568[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "<init>",
      descriptor = "(ILsa;I)V"
   )
   public class538(int arg0, class39 arg1, int arg2) {
      super(arg0);

      try {
         this.field7562 = arg2;
         this.field7560 = arg1;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field7568[4] + arg0 + ',' + (arg1 != null ? field7568[1] : field7568[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "a",
      descriptor = "(Z[B)I"
   )
   public final int method4011(boolean arg0, byte[] arg1) throws IOException {
      boolean var3 = client.field10022;

      try {
         ++field7566;
         if (this.field7559 == null) {
            if (!this.field7560.method442(true, 0, this.field7562)) {
               return 0;
            }

            byte[] var4 = this.field7560.method460((byte)-11, 0, this.field7562);
            if (var4 == null) {
               throw new IllegalStateException("");
            }

            this.field7567.field942 = var4;
            this.field7567.field945 = 0;
            int var5 = var4.length >> 1;
            this.field7559 = new int[var5];
            int var6 = 0;
            if (var3 || ~var6 > ~var5) {
               do {
                  this.field7559[var6] = this.field7567.method685(-2);
                  ++var6;
               } while(~var6 > ~var5);
            }
         }

         if (~this.field7559.length >= ~this.field7563) {
            return -1;
         } else {
            this.method4010(102);
            this.field7567.field945 = 0;
            this.field7567.field942 = arg1;
            if (!var3 && this.field7567.field942.length <= this.field7567.field945) {
               this.field7567.field942 = null;
               return !arg0 ? 13 : arg1.length;
            } else {
               label96:
               do {
                  if (this.field7561.field942 == null) {
                     if (this.field7564[0] == null) {
                        this.field7567.field942 = null;
                        return this.field7567.field945;
                     }

                     this.field7561.field942 = this.field7564[0];
                  }

                  int var7 = this.field7567.field942.length + -this.field7567.field945;
                  int var8 = this.field7561.field942.length + -this.field7561.field945;
                  int var10000 = var7;

                  do {
                     if (var10000 < var8) {
                        this.field7561.method678(var7, -32768, this.field7567.field945, this.field7567.field942);
                        this.field7567.field942 = null;
                        return arg1.length;
                     }

                     this.field7567.method694(this.field7561.field945, var8, this.field7561.field942, -7033);
                     this.field7561.field945 = 0;
                     this.field7561.field942 = null;
                     ++this.field7563;
                     int var9 = 0;
                     if (var3) {
                        this.field7564[var9] = this.field7564[var9 + 1];
                        ++var9;
                     }

                     while(true) {
                        class538 var12;
                        if (var9 >= 9) {
                           this.field7564[9] = null;
                           var12 = this;
                           if (!var3) {
                              if (this.field7563 < this.field7559.length) {
                                 continue label96;
                              }

                              this.field7567.field942 = null;
                              var10000 = this.field7567.field945;
                              break;
                           }
                        } else {
                           var12 = this;
                        }

                        var12.field7564[var9] = this.field7564[var9 + 1];
                        ++var9;
                     }
                  } while(var3);

                  return var10000;
               } while(this.field7567.field942.length > this.field7567.field945);

               this.field7567.field942 = null;
               if (!arg0) {
                  return 13;
               } else {
                  return arg1.length;
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field7568[3] + arg0 + ',' + (arg1 != null ? field7568[1] : field7568[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4012(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ij",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4013(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 26;
            break;
         case 1:
            var10005 = 14;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 105;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
