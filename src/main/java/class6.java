import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class6 {
   @OriginalMember(
      owner = "client!se",
      name = "e",
      descriptor = "I"
   )
   public int field78;
   @OriginalMember(
      owner = "client!se",
      name = "a",
      descriptor = "I"
   )
   private int field80;
   @OriginalMember(
      owner = "client!se",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field84 = new String[]{method52(method51("aZ\u0013\u0015d")), method52(method51("aZ\u0013\u0017d")), method52(method51("aZ\u0013 #AKO=\"u\u0017")), method52(method51("aZ\u0013\u0016d")), method52(method51("aZ\u0013h%|VIjd")), method52(method51("aZ\u0013\u0010d"))};
   @OriginalMember(
      owner = "client!se",
      name = "f",
      descriptor = "Lse;"
   )
   public static class6 field81 = new class6(68, -1);
   @OriginalMember(
      owner = "client!se",
      name = "d",
      descriptor = "I"
   )
   public static int field75;
   @OriginalMember(
      owner = "client!se",
      name = "i",
      descriptor = "I"
   )
   public static int field76;
   @OriginalMember(
      owner = "client!se",
      name = "h",
      descriptor = "I"
   )
   public static int field77;
   @OriginalMember(
      owner = "client!se",
      name = "b",
      descriptor = "I"
   )
   public static int field79;
   @OriginalMember(
      owner = "client!se",
      name = "g",
      descriptor = "I"
   )
   public static int field82;
   @OriginalMember(
      owner = "client!se",
      name = "c",
      descriptor = "I"
   )
   public static int field83;

   @OriginalMember(
      owner = "client!se",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method47(int arg0) {
      try {
         if (arg0 != 9189) {
            field83 = -18;
         }

         ++field77;
         return this.field80;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field84[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!se",
      name = "a",
      descriptor = "(II)Lwc;"
   )
   public static final class394 method48(int arg0, int arg1) {
      try {
         ++field75;
         if (arg0 == arg1) {
            if ((double)class326.field4481 == 3.0D) {
               return class791.field11578;
            }

            if ((double)class326.field4481 == 4.0D) {
               return class12.field242;
            }

            if ((double)class326.field4481 == 6.0D) {
               return class783.field11427;
            }

            if ((double)class326.field4481 >= 8.0D) {
               return class644.field9661;
            }
         } else if (arg0 == 1) {
            if ((double)class326.field4481 == 3.0D) {
               return class783.field11427;
            }

            if ((double)class326.field4481 == 4.0D) {
               return class644.field9661;
            }

            if ((double)class326.field4481 == 6.0D) {
               return class479.field6660;
            }

            if ((double)class326.field4481 >= 8.0D) {
               return class631.field9312;
            }
         } else if (arg0 == 2) {
            if ((double)class326.field4481 == 3.0D) {
               return class479.field6660;
            }

            if ((double)class326.field4481 == 4.0D) {
               return class631.field9312;
            }

            if ((double)class326.field4481 == 6.0D) {
               return class58.field765;
            }

            if ((double)class326.field4481 >= 8.0D) {
               return class693.field10174;
            }
         }

         return null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field84[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!se",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method49(int arg0) {
      try {
         if (arg0 == -2260) {
            field81 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field84[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!se",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field76;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field84[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!se",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method50(byte arg0) {
      boolean var1 = client.field1481;

      try {
         ++field79;
         if (arg0 <= -27) {
            label37: {
               int var2 = class757.field11093.field11018.method204(-18033);
               if (var2 == 0) {
                  class755.field11063 = null;
                  class454.method3481(0, (byte)89);
                  if (!var1) {
                     break label37;
                  }
               }

               if (var2 != 1) {
                  class629.method4651(0, (byte)(class188.field2389 + -4 & 255));
                  class454.method3481(2, (byte)-81);
                  if (!var1) {
                     break label37;
                  }
               }

               class629.method4651(0, (byte)0);
               class454.method3481(512, (byte)-113);
               if (class245.field3092 != null) {
                  class245.method1943((byte)97);
               }
            }

            class714.field10500 = class674.field9984;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field84[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!se",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class6(int arg0, int arg1) {
      try {
         this.field78 = arg1;
         this.field80 = arg0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field84[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!se",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method51(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!se",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method52(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 63;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 84;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
