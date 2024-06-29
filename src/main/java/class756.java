import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class756 extends class55 {
   @OriginalMember(
      owner = "client!cp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11209 = new String[]{method5494(method5493(":hbgc")), method5494(method5493(":hbhc")), method5494(method5493(":hbic")), method5494(method5493(":hbkc")), method5494(method5493("7m B")), method5494(method5493(":hblc")), method5494(method5493("\"6b\u00006")), method5494(method5493("c8")), method5494(method5493(":hbmc")), method5494(method5493(":hbfc")), method5494(method5493(":hbjc")), method5494(method5493(":hboc"))};
   @OriginalMember(
      owner = "client!cp",
      name = "n",
      descriptor = "I"
   )
   public static int field11196 = 0;
   @OriginalMember(
      owner = "client!cp",
      name = "m",
      descriptor = "I"
   )
   public static int field11206 = -1;
   @OriginalMember(
      owner = "client!cp",
      name = "f",
      descriptor = "F"
   )
   public static float field11208;
   @OriginalMember(
      owner = "client!cp",
      name = "l",
      descriptor = "I"
   )
   public static int field11197;
   @OriginalMember(
      owner = "client!cp",
      name = "o",
      descriptor = "I"
   )
   public static int field11198;
   @OriginalMember(
      owner = "client!cp",
      name = "e",
      descriptor = "I"
   )
   public static int field11199;
   @OriginalMember(
      owner = "client!cp",
      name = "s",
      descriptor = "I"
   )
   public static int field11200;
   @OriginalMember(
      owner = "client!cp",
      name = "g",
      descriptor = "I"
   )
   public static int field11201;
   @OriginalMember(
      owner = "client!cp",
      name = "i",
      descriptor = "I"
   )
   public static int field11202;
   @OriginalMember(
      owner = "client!cp",
      name = "p",
      descriptor = "I"
   )
   public static int field11203;
   @OriginalMember(
      owner = "client!cp",
      name = "h",
      descriptor = "I"
   )
   public static int field11205;
   @OriginalMember(
      owner = "client!cp",
      name = "q",
      descriptor = "I"
   )
   public static int field11207;
   @OriginalMember(
      owner = "client!cp",
      name = "r",
      descriptor = "J"
   )
   public static long field11194;
   @OriginalMember(
      owner = "client!cp",
      name = "k",
      descriptor = "[Lbg;"
   )
   public static class492[] field11195;
   @OriginalMember(
      owner = "client!cp",
      name = "j",
      descriptor = "[Lgn;"
   )
   public static class731[] field11204;

   @OriginalMember(
      owner = "client!cp",
      name = "e",
      descriptor = "(I)V",
      line = 3
   )
   public static void method5488(int arg0) {
      try {
         if (arg0 <= -13) {
            field11195 = null;
            field11204 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11209[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "c",
      descriptor = "(I)V",
      line = 15
   )
   public static final void method5489(int arg0) {
      try {
         ++field11202;
         if (class768.field11317 != null) {
            try {
               class768.field11317.close();
            } catch (IOException var2) {
            }
         }

         class768.field11317 = null;
         if (arg0 != 0) {
            method5492((byte)-114, (String)null);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11209[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "d",
      descriptor = "(I)I",
      line = 38
   )
   public final int method5490(int arg0) {
      try {
         ++field11205;
         int var2 = -15 % ((36 - arg0) / 41);
         return super.field680;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11209[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "<init>",
      descriptor = "(Lifa;)V",
      line = 48
   )
   public class756(class453 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!cp",
      name = "<init>",
      descriptor = "(ILifa;)V",
      line = 51
   )
   public class756(int arg0, class453 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(I)V",
      line = 59
   )
   public final void method98(int arg0) {
      try {
         ++field11200;
         if (arg0 != 0) {
            field11203 = 89;
         }

         if (~super.field680 != -1 && super.field683.field6449.method1711(95) != 1) {
            super.field680 = 0;
         }

         if (~super.field680 > -1 || super.field680 > 1) {
            super.field680 = this.method101(-125);
         }

      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11209[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "b",
      descriptor = "(I)I",
      line = 80
   )
   public final int method101(int arg0) {
      try {
         if (arg0 > -116) {
            this.method97(48, (byte)67);
         }

         ++field11197;
         return 1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11209[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(B)Z",
      line = 91
   )
   public final boolean method5491(byte arg0) {
      try {
         if (arg0 != 120) {
            field11204 = null;
         }

         ++field11207;
         return true;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11209[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(IB)I",
      line = 104
   )
   public final int method97(int arg0, byte arg1) {
      try {
         ++field11201;
         if (arg0 != 0 && ~super.field683.field6449.method1711(arg1 ^ 31) != -2) {
            return arg1 != 105 ? 86 : 2;
         } else {
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11209[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "b",
      descriptor = "(IB)V",
      line = 124
   )
   public final void method96(int arg0, byte arg1) {
      try {
         super.field680 = arg0;
         ++field11199;
         int var3 = 84 / ((47 - arg1) / 46);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field11209[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(BLjava/lang/String;)V",
      line = 138
   )
   public static final void method5492(byte arg0, String arg1) {
      boolean var2 = client.field4360;

      try {
         if (class65.field793 == null) {
            class510.method3702(true);
         }

         ++field11198;
         class757.field11217.setTime(new Date(class133.method1054(arg0 + -29131)));
         int var3 = class757.field11217.get(11);
         int var4 = class757.field11217.get(12);
         int var5 = class757.field11217.get(13);
         if (arg0 != 106) {
            field11204 = null;
         }

         String var6 = Integer.toString(var3 / 10) + var3 % 10 + ":" + var4 / 10 + var4 % 10 + ":" + var5 / 10 + var5 % 10;
         String[] var7 = class527.method3811(-29619, arg1, '\n');
         int var8 = 0;
         if (var2 || ~var7.length < ~var8) {
            do {
               int var9 = class234.field3265;
               if (var2) {
                  class65.field793[var9] = class65.field793[var9 + -1];
                  --var9;
               }

               while(true) {
                  while(~var9 < -1) {
                     class65.field793[var9] = class65.field793[var9 + -1];
                     --var9;
                  }

                  class65.field793[0] = var6 + field11209[7] + var7[var8];
                  if (!var2) {
                     if (class768.field11317 != null) {
                        try {
                           class768.field11317.write(class525.method3801(false, class65.field793[0] + "\n"));
                        } catch (IOException var11) {
                        }
                     }

                     if (~(class65.field793.length + -1) < ~class234.field3265) {
                        if (~class141.field1799 < -1) {
                           ++class141.field1799;
                        }

                        ++class234.field3265;
                     }

                     ++var8;
                     break;
                  }

                  --var9;
               }
            } while(~var7.length < ~var8);

         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field11209[5] + arg0 + ',' + (arg1 != null ? field11209[6] : field11209[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5493(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5494(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 24;
            break;
         case 2:
            var10005 = 76;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
