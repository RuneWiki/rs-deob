import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class119 extends class698 {
   @OriginalMember(
      owner = "client!rba",
      name = "h",
      descriptor = "Ljava/net/Socket;"
   )
   private Socket field1566;
   @OriginalMember(
      owner = "client!rba",
      name = "c",
      descriptor = "Lcaa;"
   )
   private class605 field1564;
   @OriginalMember(
      owner = "client!rba",
      name = "g",
      descriptor = "Lpv;"
   )
   private class190 field1567;
   @OriginalMember(
      owner = "client!rba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1575 = new String[]{method1053(method1052(" 5/\u007f=z")), method1053(method1052(")y`\u007f\b")), method1053(method1052("<\"\"=")), method1053(method1052(" 5/\u007f\u0013;9/=\u001c(2f")), method1053(method1052(" 5/\u007f4z")), method1053(method1052(" 5/\u007f7z")), method1053(method1052(" 5/\u007f3z")), method1053(method1052(" 5/\u007fI;9'%Kz")), method1053(method1052(" 5/\u007f2z")), method1053(method1052(" 5/\u007f6z")), method1053(method1052(" 5/\u007f0z")), method1053(method1052(" 5/\u007f1z"))};
   @OriginalMember(
      owner = "client!rba",
      name = "f",
      descriptor = "I"
   )
   public static int field1570 = 1403;
   @OriginalMember(
      owner = "client!rba",
      name = "e",
      descriptor = "Lse;"
   )
   public static class6 field1571 = new class6(74, 18);
   @OriginalMember(
      owner = "client!rba",
      name = "i",
      descriptor = "I"
   )
   public static int field1572 = -1;
   @OriginalMember(
      owner = "client!rba",
      name = "j",
      descriptor = "I"
   )
   public static int field1560;
   @OriginalMember(
      owner = "client!rba",
      name = "d",
      descriptor = "I"
   )
   public static int field1561;
   @OriginalMember(
      owner = "client!rba",
      name = "k",
      descriptor = "I"
   )
   public static int field1562;
   @OriginalMember(
      owner = "client!rba",
      name = "q",
      descriptor = "I"
   )
   public static int field1563;
   @OriginalMember(
      owner = "client!rba",
      name = "n",
      descriptor = "I"
   )
   public static int field1565;
   @OriginalMember(
      owner = "client!rba",
      name = "o",
      descriptor = "I"
   )
   public static int field1568;
   @OriginalMember(
      owner = "client!rba",
      name = "l",
      descriptor = "I"
   )
   public static int field1569;
   @OriginalMember(
      owner = "client!rba",
      name = "m",
      descriptor = "I"
   )
   public static int field1573;
   @OriginalMember(
      owner = "client!rba",
      name = "p",
      descriptor = "Lhj;"
   )
   public static class170 field1574;

   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "(II)Z"
   )
   public final boolean method1044(int arg0, int arg1) throws IOException {
      try {
         if (arg1 != -1) {
            return false;
         } else {
            ++field1560;
            return this.field1564.method4480((byte)-91, arg0);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1575[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "(BF)F"
   )
   public static final float method1045(byte arg0, float arg1) {
      try {
         ++field1562;
         return arg0 > -107 ? 1.6815196F : arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1575[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "(BII[B)I"
   )
   public final int method1046(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
      try {
         if (arg0 != 15) {
            this.method1051((byte)-86);
         }

         ++field1569;
         return this.field1564.method4485(arg2, arg1, arg3, (byte)-118);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field1575[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1575[1] : field1575[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "(ILkea;Z)V"
   )
   public static final void method1047(int arg0, class614 arg1, boolean arg2) {
      boolean var3 = client.field1481;

      try {
         label116: {
            if (!arg1.field9036) {
               if (!arg1.field9038 || ~arg1.field9040 > -2 || arg1.field9035 < 1 || ~arg1.field9040 < ~(class273.field3491 + -2) || ~(class211.field2689 + -2) > ~arg1.field9035 || arg1.field9041 >= 0 && !class311.method2480(arg1.field9041, arg1.field9039, true)) {
                  break label116;
               }

               label107: {
                  if (!arg2) {
                     class509.method3846(arg1.field9037, arg1.field9039, -1, arg1.field9041, arg1.field9040, arg1.field9050, true, arg1.field9035, arg1.field9044);
                     if (!var3) {
                        break label107;
                     }
                  }

                  class258.method2081(arg1.field9044, 1, arg1.field9040, arg1.field9047, arg1.field9050, arg1.field9035);
               }

               arg1.field9038 = false;
               if (!arg2 && ~arg1.field9049 == ~arg1.field9041 && arg1.field9049 == -1) {
                  arg1.method4924(-2970);
                  if (!var3) {
                     break label116;
                  }
               }

               if (arg2 || arg1.field9049 != arg1.field9041 || arg1.field9037 != arg1.field9034 || arg1.field9043 != arg1.field9039) {
                  break label116;
               }

               arg1.method4924(arg0 ^ -2956);
               if (!var3) {
                  break label116;
               }
            }

            if (~arg1.field9049 > -1 || class311.method2480(arg1.field9049, arg1.field9043, true)) {
               label71: {
                  if (arg2) {
                     class258.method2081(arg1.field9044, arg0 + -17, arg1.field9040, (class271)null, arg1.field9050, arg1.field9035);
                     if (!var3) {
                        break label71;
                     }
                  }

                  class509.method3846(arg1.field9034, arg1.field9043, -1, arg1.field9049, arg1.field9040, arg1.field9050, true, arg1.field9035, arg1.field9044);
               }

               arg1.method4924(-2970);
            }
         }

         ++field1565;
         if (arg0 != 18) {
            field1574 = null;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1575[0] + arg0 + ',' + (arg1 != null ? field1575[1] : field1575[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "([BIII)V"
   )
   public final void method1048(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
      try {
         this.field1567.method1584((byte)60, arg0, arg3, arg1);
         ++field1561;
         if (arg2 != -1) {
            this.finalize();
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field1575[6] + (arg0 != null ? field1575[1] : field1575[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1049(int arg0) {
      try {
         field1571 = null;
         field1574 = null;
         if (arg0 != 1) {
            method1045((byte)116, 0.18249612F);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1575[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "<init>",
      descriptor = "(Ljava/net/Socket;I)V"
   )
   public class119(Socket arg0, int arg1) throws IOException {
      try {
         this.field1566 = arg0;
         this.field1566.setSoTimeout(30000);
         this.field1566.setTcpNoDelay(true);
         this.field1564 = new class605(this.field1566.getInputStream(), arg1);
         this.field1567 = new class190(this.field1566.getOutputStream(), arg1);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1575[7] + (arg0 != null ? field1575[1] : field1575[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      try {
         ++field1563;
         this.method1050(9);
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1575[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1050(int arg0) {
      try {
         ++field1573;

         try {
            if (arg0 != 9) {
               this.method1050(83);
            }

            this.field1566.close();
         } catch (IOException var3) {
         }

         this.field1564.method4479(-1);
         this.field1567.method1587(117);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1575[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1051(byte arg0) {
      try {
         ++field1568;
         this.field1564.method4482((byte)77);
         this.field1567.method1585(19);
         if (arg0 != -79) {
            this.field1566 = null;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1575[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1052(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1053(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 82;
            break;
         case 1:
            var10005 = 87;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 81;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
