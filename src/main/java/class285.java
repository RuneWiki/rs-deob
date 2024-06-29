import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class285 {
   @OriginalMember(
      owner = "client!ae",
      name = "b",
      descriptor = "I"
   )
   public int field3949;
   @OriginalMember(
      owner = "client!ae",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3950 = new String[]{method2324(method2323("WKX\u001c\f")), method2324(method2323("WKX\u001d\f")), method2324(method2323("WKXcMXG\u0002a\f")), method2324(method2323("M\u0000XqY")), method2324(method2323("X[\u001a3")), method2324(method2323("WKX\u001e\f")), method2324(method2323("WKX+KeZ\u00046JQ\u0006"))};
   @OriginalMember(
      owner = "client!ae",
      name = "c",
      descriptor = "Lse;"
   )
   public static class6 field3948 = new class6(45, -1);
   @OriginalMember(
      owner = "client!ae",
      name = "d",
      descriptor = "I"
   )
   public static int field3945;
   @OriginalMember(
      owner = "client!ae",
      name = "e",
      descriptor = "I"
   )
   public static int field3946;
   @OriginalMember(
      owner = "client!ae",
      name = "a",
      descriptor = "I"
   )
   public static int field3947;

   @OriginalMember(
      owner = "client!ae",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field3946;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3950[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ae",
      name = "a",
      descriptor = "(II)Lsja;"
   )
   public static final class70 method2320(int arg0, int arg1) {
      try {
         ++field3947;
         if (arg0 != 0) {
            if (~arg0 == -2) {
               return new class250();
            }

            if (arg0 == 2) {
               return new class121();
            }

            if (arg0 == 3) {
               return new class192();
            }

            if (~arg0 == -5) {
               return new class320();
            }

            if (~arg0 == -6) {
               return new class618();
            }

            if (arg0 == 6) {
               return new class395();
            }

            if (arg0 == 7) {
               return new class567();
            }

            if (arg0 == 8) {
               return new class218();
            }

            if (~arg0 == -10) {
               return new class169();
            }

            if (~arg0 == -11) {
               return new class61();
            }

            if (~arg0 == -12) {
               return new class178();
            }

            if (arg0 == 12) {
               return new class63();
            }

            if (arg0 == 13) {
               return new class44();
            }

            if (~arg0 == -15) {
               return new class569();
            }

            if (~arg0 == -16) {
               return new class725();
            }

            if (~arg0 == -17) {
               return new class751();
            }

            if (~arg0 == -18) {
               return new class94();
            }

            if (~arg0 == -19) {
               return new class77();
            }

            if (arg0 == 19) {
               return new class172();
            }

            if (arg0 == 20) {
               return new class624();
            }

            if (~arg0 == -22) {
               return new class315();
            }

            if (~arg0 == -23) {
               return new class688();
            }

            if (~arg0 == -24) {
               return new class86();
            }

            if (~arg0 == -25) {
               return new class225();
            }

            if (arg0 == 25) {
               return new class616();
            }

            if (arg0 == 26) {
               return new class436();
            }

            if (arg0 == 27) {
               return new class756();
            }

            if (~arg0 == -29) {
               return new class166();
            }

            if (~arg0 == -30) {
               return new class582();
            }

            if (~arg0 == -31) {
               return new class515();
            }

            if (arg0 == 31) {
               return new class561();
            }

            if (~arg0 == -33) {
               return new class109();
            }

            if (~arg0 == -34) {
               return new class768();
            }

            if (arg0 == 34) {
               return new class210();
            }

            if (~arg0 == -36) {
               return new class84();
            }

            if (arg0 == 36) {
               return new class510();
            }

            if (~arg0 == -38) {
               return new class442();
            }

            if (~arg0 == -39) {
               return new class739();
            }

            if (~arg0 != -40) {
               if (arg1 != 27) {
                  method2320(119, -74);
               }

               return null;
            }

            if (!client.field1481) {
               return new class405();
            }
         }

         return new class390();
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3950[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ae",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method2321(byte arg0) {
      try {
         ++field3945;
         if (arg0 <= 115) {
            this.toString();
         }

         return this.field3949;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3950[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ae",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2322(int arg0) {
      try {
         if (arg0 != -17) {
            field3948 = null;
         }

         field3948 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3950[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ae",
      name = "<init>",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public class285(String arg0, int arg1) {
      try {
         this.field3949 = arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3950[2] + (arg0 != null ? field3950[3] : field3950[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ae",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2323(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ae",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2324(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 46;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 95;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
