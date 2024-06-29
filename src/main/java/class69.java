import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class69 {
   @OriginalMember(
      owner = "client!jh",
      name = "e",
      descriptor = "[I"
   )
   public int[] field906;
   @OriginalMember(
      owner = "client!jh",
      name = "c",
      descriptor = "[I"
   )
   public int[] field910;
   @OriginalMember(
      owner = "client!jh",
      name = "j",
      descriptor = "[I"
   )
   public int[] field911;
   @OriginalMember(
      owner = "client!jh",
      name = "k",
      descriptor = "[I"
   )
   public int[] field909;
   @OriginalMember(
      owner = "client!jh",
      name = "d",
      descriptor = "[S"
   )
   public short[] field904;
   @OriginalMember(
      owner = "client!jh",
      name = "i",
      descriptor = "[S"
   )
   public short[] field907;
   @OriginalMember(
      owner = "client!jh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field914 = new String[]{method536(method535("N\u001b(l0")), method536(method535("N\u0012pL6E\u0004r\u0003[K\u001evBvA\u001dr")), method536(method535("N\u001b(o0")), method536(method535("T\u001e")), method536(method535("_](\u0003e")), method536(method535("J\u0006jA")), method536(method535("N\u001b(n0")), method536(method535("N\u001b(\u0011qJ\u001ar\u00130"))};
   @OriginalMember(
      owner = "client!jh",
      name = "f",
      descriptor = "Luk;"
   )
   public static class498 field905 = new class498(105, 28);
   @OriginalMember(
      owner = "client!jh",
      name = "b",
      descriptor = "I"
   )
   public static int field903;
   @OriginalMember(
      owner = "client!jh",
      name = "h",
      descriptor = "I"
   )
   public static int field908;
   @OriginalMember(
      owner = "client!jh",
      name = "g",
      descriptor = "I"
   )
   public static int field912;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!jh",
      name = "a",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field913;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!jh",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method534(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!jh",
      name = "a",
      descriptor = "(Ljava/awt/Component;ZB)Lau;",
      line = 9
   )
   public static final class736 method531(Component arg0, boolean arg1, byte arg2) {
      try {
         ++field912;

         try {
            Constructor var3 = Class.forName(field914[3]).getDeclaredConstructor(field913 != null ? field913 : (field913 = method534(field914[1])), Boolean.TYPE);
            if (arg2 != 74) {
               field905 = null;
            }

            return (class736)var3.newInstance(arg0, new Boolean(arg1));
         } catch (Throwable var5) {
            return new class636(arg0, arg1);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field914[2] + (arg0 != null ? field914[4] : field914[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jh",
      name = "a",
      descriptor = "(II)V",
      line = 30
   )
   public static final void method532(int arg0, int arg1) {
      boolean var2 = client.field1786;

      try {
         ++field903;
         if (~class342.field5204 != ~arg1) {
            if (arg1 == 14 || ~arg1 == -16) {
               class173.method1592((byte)38);
            }

            if (arg0 != 1) {
               method532(40, 79);
            }

            if (arg1 != 14 && class346.field5308 != null) {
               class346.field5308.method1579(arg0 + -129);
               class346.field5308 = null;
            }

            if (arg1 == 3) {
               class705.method5199(0, class728.field10872 != class288.field4539);
            }

            if (~arg1 == -8) {
               class744.method5469((byte)34, ~class441.field6789 != ~class288.field4539);
            }

            label171: {
               if (~arg1 == -6 || ~arg1 == -14) {
                  class429.method3390((byte)-118);
                  if (!var2) {
                     break label171;
                  }
               }

               if (arg1 == 6 || arg1 == 9 && class342.field5204 != 10) {
                  class173.method1592((byte)38);
               }
            }

            if (class544.method4149(0, class342.field5204)) {
               class542.field8173.field10119 = 2;
               class391.field6141.field10119 = 2;
               class32.field407.field10119 = 2;
               class734.field10945.field10119 = 2;
               class208.field3175.field10119 = 2;
               class356.field5481.field10119 = 2;
               class201.field3081.field10119 = 2;
            }

            if (class544.method4149(0, arg1)) {
               class13.field163 = 0;
               class486.field7396 = 1;
               class234.field3585 = 1;
               class338.field5181 = 0;
               class306.field4786 = 0;
               class1.method1(26215, true);
               class542.field8173.field10119 = 1;
               class391.field6141.field10119 = 1;
               class32.field407.field10119 = 1;
               class734.field10945.field10119 = 1;
               class208.field3175.field10119 = 1;
               class356.field5481.field10119 = 1;
               class201.field3081.field10119 = 1;
            }

            if (~arg1 == -13 || arg1 == 3) {
               class312.method2598(1);
            }

            boolean var3 = arg1 == 2 || class298.method2501(26256, arg1) || class303.method2535(arg1, 101);
            boolean var4 = class342.field5204 == 2 || class298.method2501(arg0 ^ 26257, class342.field5204) || class303.method2535(class342.field5204, 119);
            if (var3 != var4) {
               label107: {
                  if (var3) {
                     label104: {
                        class77.field1033 = class155.field2312;
                        if (class687.field10213.field499.method1774(480102311) != 0) {
                           class65.method501(class690.field10251, 2, class687.field10213.field499.method1774(480102311), 0, (byte)-26, false, class155.field2312);
                           class147.method1348(6819);
                           if (!var2) {
                              break label104;
                           }
                        }

                        class607.method4475((byte)-115, 2);
                     }

                     class522.field7958.method1843(-2, false);
                     if (!var2) {
                        break label107;
                     }
                  }

                  class607.method4475((byte)-115, 2);
                  class522.field7958.method1843(-2, true);
               }
            }

            if (class544.method4149(0, arg1) || arg1 == 14 || ~arg1 == -16) {
               class351.field5356.method680();
            }

            class342.field5204 = arg1;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field914[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jh",
      name = "<init>",
      descriptor = "(Luj;)V",
      line = 142
   )
   public class69(class136 arg0) {
      try {
         this.field906 = new int[3];
         this.field910 = new int[2];
         this.field911 = new int[2];
         this.field909 = new int[3];
         this.field906[2] = arg0.field1919;
         this.field906[1] = arg0.field1926;
         this.field906[0] = arg0.field1911;
         this.field909[2] = arg0.field1973;
         this.field909[1] = arg0.field1934;
         this.field909[0] = arg0.field1972;
         this.field911[0] = arg0.field1946;
         this.field911[1] = arg0.field1958;
         this.field910[0] = arg0.field1980;
         this.field910[1] = arg0.field1954;
         if (arg0.field1930 != null) {
            this.field904 = new short[arg0.field1930.length];
            class107.method1024(arg0.field1930, 0, this.field904, 0, this.field904.length);
         }

         if (arg0.field1950 != null) {
            this.field907 = new short[arg0.field1950.length];
            class107.method1024(arg0.field1950, 0, this.field907, 0, this.field907.length);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field914[7] + (arg0 != null ? field914[4] : field914[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jh",
      name = "a",
      descriptor = "(I)V",
      line = 177
   )
   public static void method533(int arg0) {
      try {
         field905 = null;
         if (arg0 != -32209) {
            method533(122);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field914[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method535(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method536(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 115;
            break;
         case 2:
            var10005 = 6;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
