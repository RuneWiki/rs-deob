import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class171 extends class410 {
   @OriginalMember(
      owner = "client!fga",
      name = "h",
      descriptor = "Ljava/net/Socket;"
   )
   private Socket field2603;
   @OriginalMember(
      owner = "client!fga",
      name = "n",
      descriptor = "Lvia;"
   )
   private class552 field2612;
   @OriginalMember(
      owner = "client!fga",
      name = "f",
      descriptor = "Luu;"
   )
   private class717 field2610;
   @OriginalMember(
      owner = "client!fga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2613 = new String[]{method1586(method1585("A2:V#\u000f")), method1586(method1585("I 7\u0014")), method1586(method1585("\\{uV\u001b")), method1586(method1585("A2:VZN;2\fX\u000f")), method1586(method1585("A2:V\u0000N;:\u0014\u000f]0s")), method1586(method1585("A2:V!\u000f")), method1586(method1585("A2:V%\u000f")), method1586(method1585("A2:V\"\u000f")), method1586(method1585("A2:V$\u000f")), method1586(method1585("A2:V \u000f")), method1586(method1585("A2:V'\u000f"))};
   @OriginalMember(
      owner = "client!fga",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field2604 = false;
   @OriginalMember(
      owner = "client!fga",
      name = "g",
      descriptor = "I"
   )
   public static int field2601;
   @OriginalMember(
      owner = "client!fga",
      name = "l",
      descriptor = "I"
   )
   public static int field2602;
   @OriginalMember(
      owner = "client!fga",
      name = "p",
      descriptor = "I"
   )
   public static int field2605;
   @OriginalMember(
      owner = "client!fga",
      name = "j",
      descriptor = "I"
   )
   public static int field2606;
   @OriginalMember(
      owner = "client!fga",
      name = "m",
      descriptor = "I"
   )
   public static int field2607;
   @OriginalMember(
      owner = "client!fga",
      name = "e",
      descriptor = "I"
   )
   public static int field2608;
   @OriginalMember(
      owner = "client!fga",
      name = "i",
      descriptor = "I"
   )
   public static int field2609;
   @OriginalMember(
      owner = "client!fga",
      name = "o",
      descriptor = "I"
   )
   public static int field2611;

   @OriginalMember(
      owner = "client!fga",
      name = "a",
      descriptor = "(IIZ[B)V",
      line = 5
   )
   public final void method1578(int arg0, int arg1, boolean arg2, byte[] arg3) throws IOException {
      try {
         if (arg2) {
            field2604 = true;
         }

         this.field2610.method5308(arg3, arg0, (byte)93, arg1);
         ++field2601;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field2613[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2613[2] : field2613[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fga",
      name = "finalize",
      descriptor = "()V",
      line = 16
   )
   protected final void finalize() {
      try {
         ++field2605;
         this.method1579(-128);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2613[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fga",
      name = "a",
      descriptor = "(I)V",
      line = 26
   )
   public final void method1579(int arg0) {
      try {
         ++field2606;
         if (arg0 >= -127) {
            this.field2612 = null;
         }

         try {
            this.field2603.close();
         } catch (IOException var3) {
         }

         this.field2612.method4192(16776960);
         this.field2610.method5307(0);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2613[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fga",
      name = "a",
      descriptor = "(IIIII)V",
      line = 48
   )
   public static final void method1580(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var5 = client.field1786;

      try {
         ++field2602;
         if (~class67.field883 == -2) {
            int var6 = arg4 / class155.field2316;
            int var7 = arg0 / class155.field2316;
            int var8 = arg3 / class37.field444;
            int var9 = arg1 / class37.field444;
            if (~class13.field166 < ~var6 && ~var7 <= -1 && ~var8 > ~class395.field6185 && var9 >= 0) {
               if (var6 < 0) {
                  var6 = 0;
               }

               if (~var8 > -1) {
                  var8 = 0;
               }

               if (class13.field166 <= var7) {
                  var7 = class13.field166 + -1;
               }

               if (class395.field6185 <= var9) {
                  var9 = class395.field6185 + -1;
               }

               if (arg2 < -17) {
                  int var10 = var8;
                  if (var5 || var9 >= var8) {
                     do {
                        int var11 = class409.method3280(var10 - -class249.field3781, (byte)-105, class395.field6185) * class13.field166;
                        int var12 = var6;
                        if (var5 || var6 <= var7) {
                           do {
                              int var13 = var11 - -class409.method3280(var12 - -class25.field321, (byte)-103, class13.field166);
                              class276.field4410[var13] = class456.field7001;
                              ++var12;
                           } while(var12 <= var7);
                        }

                        ++var10;
                     } while(var9 >= var10);

                  }
               }
            }
         }
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field2613[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fga",
      name = "c",
      descriptor = "(I)V",
      line = 107
   )
   public final void method1581(int arg0) {
      try {
         this.field2612.method4190((byte)107);
         ++field2609;
         this.field2610.method5309(2048);
         if (arg0 != -1238) {
            this.field2610 = null;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2613[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fga",
      name = "a",
      descriptor = "(B)[Lhka;",
      line = 119
   )
   public static final class377[] method1582(byte arg0) {
      try {
         ++field2607;
         return arg0 != 113 ? null : new class377[]{class117.field1569, class311.field4825, class86.field1260, class423.field6528, class187.field2933, class455.field6955, class285.field4494, class12.field151, class398.field6241, class401.field6287, class6.field33, class1.field2, class705.field10610, class658.field9828, class135.field1903};
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2613[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fga",
      name = "a",
      descriptor = "(II)Z",
      line = 134
   )
   public final boolean method1583(int arg0, int arg1) throws IOException {
      try {
         if (arg1 > -34) {
            field2604 = false;
         }

         ++field2608;
         return this.field2612.method4198(arg0, -1);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2613[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fga",
      name = "<init>",
      descriptor = "(Ljava/net/Socket;I)V",
      line = 145
   )
   public class171(Socket arg0, int arg1) throws IOException {
      try {
         this.field2603 = arg0;
         this.field2603.setSoTimeout(30000);
         this.field2603.setTcpNoDelay(true);
         this.field2612 = new class552(this.field2603.getInputStream(), arg1);
         this.field2610 = new class717(this.field2603.getOutputStream(), arg1);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2613[3] + (arg0 != null ? field2613[2] : field2613[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fga",
      name = "a",
      descriptor = "(I[BII)I",
      line = 157
   )
   public final int method1584(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
      try {
         if (arg3 != 29439) {
            return -48;
         } else {
            ++field2611;
            return this.field2612.method4197(arg1, arg2, (byte)36, arg0);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field2613[6] + arg0 + ',' + (arg1 != null ? field2613[2] : field2613[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1585(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 102);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1586(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 102;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
