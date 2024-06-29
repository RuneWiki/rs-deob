import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class589 extends class55 {
   @OriginalMember(
      owner = "client!pu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8695 = new String[]{method4290(method4289("Q#~6\u0006")), method4290(method4289("Q#~8\u0006")), method4290(method4289("Q#~2\u0006")), method4290(method4289("O#<\u001c")), method4290(method4289("Zx~^S")), method4290(method4289("Q#~9\u0006")), method4290(method4289("Q#~4\u0006")), method4290(method4289("Q#~3\u0006")), method4290(method4289("Q#~7\u0006")), method4290(method4289("Q#~5\u0006"))};
   @OriginalMember(
      owner = "client!pu",
      name = "h",
      descriptor = "Llea;"
   )
   public static class639 field8692 = new class639(7, 3);
   @OriginalMember(
      owner = "client!pu",
      name = "j",
      descriptor = "I"
   )
   public static int field8686;
   @OriginalMember(
      owner = "client!pu",
      name = "e",
      descriptor = "I"
   )
   public static int field8687;
   @OriginalMember(
      owner = "client!pu",
      name = "g",
      descriptor = "I"
   )
   public static int field8688;
   @OriginalMember(
      owner = "client!pu",
      name = "l",
      descriptor = "I"
   )
   public static int field8689;
   @OriginalMember(
      owner = "client!pu",
      name = "f",
      descriptor = "I"
   )
   public static int field8690;
   @OriginalMember(
      owner = "client!pu",
      name = "k",
      descriptor = "I"
   )
   public static int field8691;
   @OriginalMember(
      owner = "client!pu",
      name = "i",
      descriptor = "I"
   )
   public static int field8694;
   @OriginalMember(
      owner = "client!pu",
      name = "m",
      descriptor = "[[[S"
   )
   public static short[][][] field8693;

   @OriginalMember(
      owner = "client!pu",
      name = "a",
      descriptor = "(I[B)V"
   )
   public static final void method4284(int arg0, byte[] arg1) {
      boolean var2 = client.field4360;

      try {
         ++field8686;
         class147 var3 = new class147(arg1);
         if (arg0 <= -5) {
            while(true) {
               label83:
               while(true) {
                  int var4;
                  do {
                     var4 = var3.method1143(-15465);
                     if (~var4 == -1) {
                        return;
                     }

                     if (~var4 != -2) {
                        break;
                     }

                     int[] var5 = class744.field10852 = new int[6];
                     var5[0] = var3.method1211(-26166);
                     var5[1] = var3.method1211(-26166);
                     var5[2] = var3.method1211(-26166);
                     var5[3] = var3.method1211(-26166);
                     var5[4] = var3.method1211(-26166);
                     var5[5] = var3.method1211(-26166);
                  } while(!var2);

                  int var8;
                  int var9;
                  do {
                     if (var4 == 4) {
                        int var6 = var3.method1143(-15465);
                        class677.field9813 = new int[var6];
                        int var7 = 0;
                        if (var2) {
                           class677.field9813[var7] = var3.method1211(-26166);
                           if (class677.field9813[var7] == 65535) {
                              class677.field9813[var7] = -1;
                           }

                           ++var7;
                        }

                        while(true) {
                           if (~var7 <= ~var6) {
                              if (!var2) {
                                 if (!var2) {
                                    continue label83;
                                 }
                                 break;
                              }
                           } else {
                              class677.field9813[var7] = var3.method1211(-26166);
                           }

                           if (class677.field9813[var7] == 65535) {
                              class677.field9813[var7] = -1;
                           }

                           ++var7;
                        }
                     }

                     if (var4 != 5) {
                        continue label83;
                     }

                     var8 = var3.method1143(-15465);
                     class316.field4306 = new int[var8];
                     var9 = 0;
                  } while(var2);

                  if (var2) {
                     class316.field4306[var9] = var3.method1211(-26166);
                     if (class316.field4306[var9] == 65535) {
                        class316.field4306[var9] = -1;
                     }

                     ++var9;
                  }

                  while(true) {
                     if (~var9 <= ~var8) {
                        if (!var2) {
                           break;
                        }
                     } else {
                        class316.field4306[var9] = var3.method1211(-26166);
                     }

                     if (class316.field4306[var9] == 65535) {
                        class316.field4306[var9] = -1;
                     }

                     ++var9;
                  }
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field8695[5] + arg0 + ',' + (arg1 != null ? field8695[4] : field8695[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pu",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method97(int arg0, byte arg1) {
      try {
         if (arg1 != 105) {
            this.method96(4, (byte)-46);
         }

         ++field8690;
         return 1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8695[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pu",
      name = "<init>",
      descriptor = "(ILifa;)V"
   )
   public class589(int arg0, class453 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!pu",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4285(byte arg0) {
      try {
         field8693 = null;
         field8692 = null;
         if (arg0 < 8) {
            method4288(-109, -88, (byte)4, 122);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8695[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pu",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method101(int arg0) {
      try {
         if (arg0 > -116) {
            field8693 = null;
         }

         ++field8691;
         return 127;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8695[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pu",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method4286(int arg0) {
      try {
         int var2 = -16 % ((36 - arg0) / 41);
         ++field8688;
         return super.field680;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8695[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pu",
      name = "a",
      descriptor = "(III)Lfl;"
   )
   public static final class772 method4287(int arg0, int arg1, int arg2) {
      class517 var3 = class663.field9659[arg0][arg1][arg2];
      return var3 == null ? null : var3.field7468;
   }

   @OriginalMember(
      owner = "client!pu",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method96(int arg0, byte arg1) {
      try {
         int var3 = 117 / ((47 - arg1) / 46);
         super.field680 = arg0;
         ++field8694;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8695[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pu",
      name = "<init>",
      descriptor = "(Lifa;)V"
   )
   public class589(class453 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!pu",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method98(int arg0) {
      try {
         ++field8687;
         if (arg0 > super.field680 && ~super.field680 < -128) {
            super.field680 = this.method101(-123);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8695[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pu",
      name = "a",
      descriptor = "(IIBI)V"
   )
   public static final void method4288(int arg0, int arg1, byte arg2, int arg3) {
      try {
         ++field8689;
         class483 var4 = class342.field4643[arg0][arg3];
         if (arg2 <= 0) {
            field8693 = null;
         }

         class425.method3146(-18434, var4 == null ? class11.field121 : var4, arg1);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8695[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4289(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4290(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 33;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
