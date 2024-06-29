import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class class698 {
   @OriginalMember(
      owner = "client!pc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10479 = new String[]{method5066(method5065(">\u0004,7#")), method5066(method5065(" \u0012n\u001f")), method5066(method5065("5I,]v")), method5066(method5065(">\u0004,1#")), method5066(method5065(">\u0004,0#"))};
   @OriginalMember(
      owner = "client!pc",
      name = "e",
      descriptor = "I"
   )
   public static int field10474;
   @OriginalMember(
      owner = "client!pc",
      name = "c",
      descriptor = "I"
   )
   public static int field10476;
   @OriginalMember(
      owner = "client!pc",
      name = "b",
      descriptor = "I"
   )
   public int field10477;
   @OriginalMember(
      owner = "client!pc",
      name = "d",
      descriptor = "I"
   )
   public static int field10478;
   @OriginalMember(
      owner = "client!pc",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public String field10475;

   @OriginalMember(
      owner = "client!pc",
      name = "a",
      descriptor = "([BIIIBII[BI)V"
   )
   public static final void method5062(byte[] arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, byte[] arg7, int arg8) {
      int var9 = client.field4530;

      try {
         if (arg4 <= 30) {
            method5064(-22, true);
         }

         ++field10478;
         int var10 = -(arg1 >> 2);
         int var16 = -(arg1 & 3);
         int var11 = -arg3;
         if (var9 != 0 || ~var11 > -1) {
            label88:
            do {
               int var12 = var10;
               int var10001;
               if (var9 != 0) {
                  var10001 = arg5++;
                  arg7[var10001] += arg0[arg8++];
                  int var17 = arg5++;
                  arg7[var17] += arg0[arg8++];
                  int var18 = arg5++;
                  arg7[var18] += arg0[arg8++];
                  int var19 = arg5++;
                  arg7[var19] += arg0[arg8++];
                  var12 = var10 + 1;
               }

               while(true) {
                  while(var12 < 0) {
                     var10001 = arg5++;
                     arg7[var10001] += arg0[arg8++];
                     var10001 = arg5++;
                     arg7[var10001] += arg0[arg8++];
                     var10001 = arg5++;
                     arg7[var10001] += arg0[arg8++];
                     var10001 = arg5++;
                     arg7[var10001] += arg0[arg8++];
                     ++var12;
                  }

                  int var13 = var16;
                  if (var9 == 0) {
                     if (var9 != 0) {
                        var10001 = arg5++;
                        arg7[var10001] += arg0[arg8++];
                        var13 = var16 + 1;
                     }

                     while(true) {
                        while(var13 < 0) {
                           var10001 = arg5++;
                           arg7[var10001] += arg0[arg8++];
                           ++var13;
                        }

                        arg5 += arg2;
                        arg8 += arg6;
                        if (var9 == 0) {
                           ++var11;
                           continue label88;
                        }

                        ++var13;
                     }
                  }

                  ++var12;
               }
            } while(~var11 > -1);

         }
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field10479[0] + (arg0 != null ? field10479[2] : field10479[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field10479[2] : field10479[1]) + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "a",
      descriptor = "(I)Ljava/net/Socket;"
   )
   public final Socket method5063(int arg0) throws IOException {
      try {
         if (arg0 != 3) {
            method5064(-6, true);
         }

         ++field10474;
         return new Socket(this.field10475, this.field10477);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10479[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "b",
      descriptor = "(I)Ljava/net/Socket;"
   )
   public abstract Socket method3850(int arg0) throws IOException;

   @OriginalMember(
      owner = "client!pc",
      name = "a",
      descriptor = "(IZ)I"
   )
   public static final int method5064(int arg0, boolean arg1) {
      try {
         ++field10476;
         if (arg0 != 0) {
            method5062((byte[])null, -56, -9, 110, (byte)111, -10, 120, (byte[])null, 57);
         }

         int var2 = class4.field85;
         if (~var2 != -1) {
            if (var2 == 1) {
               return class706.field10569;
            }

            if (~var2 != -3) {
               return 0;
            }

            if (client.field4530 == 0) {
               return 0;
            }
         }

         return !arg1 ? class706.field10569 : 0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10479[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5065(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 11);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5066(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 11;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
