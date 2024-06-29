import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class693 {
   @OriginalMember(
      owner = "client!tj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10175 = new String[]{method5057(method5056("\u000fIAC\u000b")), method5057(method5056("\u000fIAD\u000b")), method5057(method5056("\u000fIAF\u000b")), method5057(method5056("\u000fIAB\u000b")), method5057(method5056("\u0000\rA)^")), method5057(method5056("\u000fIAE\u000b")), method5057(method5056("\u0015V\u0003k"))};
   @OriginalMember(
      owner = "client!tj",
      name = "b",
      descriptor = "[C"
   )
   private static char[] field10168 = new char[64];
   @OriginalMember(
      owner = "client!tj",
      name = "j",
      descriptor = "Lsia;"
   )
   public static class407 field10170;
   @OriginalMember(
      owner = "client!tj",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field10173;
   @OriginalMember(
      owner = "client!tj",
      name = "c",
      descriptor = "I"
   )
   public static int field10165;
   @OriginalMember(
      owner = "client!tj",
      name = "g",
      descriptor = "I"
   )
   public static int field10166;
   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "I"
   )
   public static int field10167;
   @OriginalMember(
      owner = "client!tj",
      name = "i",
      descriptor = "I"
   )
   public static int field10169;
   @OriginalMember(
      owner = "client!tj",
      name = "h",
      descriptor = "Lwc;"
   )
   public static class394 field10174;
   @OriginalMember(
      owner = "client!tj",
      name = "f",
      descriptor = "Lda;"
   )
   public static class447 field10171;
   @OriginalMember(
      owner = "client!tj",
      name = "e",
      descriptor = "[Lpd;"
   )
   public static class648[] field10172;

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5051(int arg0) {
      try {
         field10172 = null;
         if (arg0 > 71) {
            field10168 = null;
            field10171 = null;
            field10174 = null;
            field10170 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10175[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(ZII)Z"
   )
   public static final boolean method5052(boolean arg0, int arg1, int arg2) {
      try {
         if (arg0) {
            return true;
         } else {
            ++field10167;
            return (class561.method4224(arg2, 33, arg1) | class527.method3935(arg2, arg1, -1) | class351.method2792(arg1, arg2, 125)) & class387.method3054(arg2, 31424, arg1);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10175[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public static final void method5053(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      boolean var8 = client.field1481;

      try {
         ++field10165;
         class614 var9 = null;
         class614 var10 = (class614)class109.field1456.method288(arg6 ^ arg6);
         if (var8 || var10 != null) {
            do {
               if (var10.field9044 == arg2 && ~var10.field9040 == ~arg4 && var10.field9035 == arg3 && var10.field9050 == arg0) {
                  var9 = var10;
                  break;
               }

               var10 = (class614)class109.field1456.method290(17958);
            } while(var10 != null);
         }

         while(var8) {
         }

         if (var9 == null) {
            var9 = new class614();
            var9.field9035 = arg3;
            var9.field9040 = arg4;
            var9.field9044 = arg2;
            var9.field9050 = arg0;
            if (~arg4 <= -1 && ~arg3 <= -1 && arg4 < class273.field3491 && arg3 < class211.field2689) {
               class78.method752(var9, -105);
            }

            class109.field1456.method279(false, var9);
         }

         var9.field9037 = arg7;
         var9.field9038 = true;
         var9.field9041 = arg5;
         var9.field9036 = false;
         var9.field9039 = arg1;
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field10175[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(ILoca;II)V"
   )
   public static final void method5054(int arg0, class642 arg1, int arg2, int arg3) {
      boolean var4 = client.field1481;

      try {
         label127: {
            if (arg1.field9602 != 0) {
               if (arg1.field9602 == 1) {
                  arg1.field9570 = (-arg1.field9572 + arg0) / 2 + arg1.field9639;
                  if (!var4) {
                     break label127;
                  }
               }

               if (arg1.field9602 != 2) {
                  if (~arg1.field9602 != -4) {
                     if (~arg1.field9602 == -5) {
                        arg1.field9570 = (arg1.field9639 * arg0 >> 14) + (-arg1.field9572 + arg0) / 2;
                        if (!var4) {
                           break label127;
                        }
                     }

                     arg1.field9570 = arg0 - arg1.field9572 + -(arg1.field9639 * arg0 >> 14);
                     if (!var4) {
                        break label127;
                     }
                  }

                  arg1.field9570 = arg1.field9639 * arg0 >> 14;
                  if (!var4) {
                     break label127;
                  }
               }

               arg1.field9570 = -arg1.field9639 + -arg1.field9572 + arg0;
               if (!var4) {
                  break label127;
               }
            }

            arg1.field9570 = arg1.field9639;
         }

         ++field10169;
         if (arg3 != -5) {
            method5053(31, -100, 114, 125, 72, -121, 73, -15);
         }

         label133: {
            if (~arg1.field9619 == -1) {
               arg1.field9495 = arg1.field9582;
               if (!var4) {
                  break label133;
               }
            }

            if (arg1.field9619 == 1) {
               arg1.field9495 = (arg2 - arg1.field9629) / 2 - -arg1.field9582;
               if (!var4) {
                  break label133;
               }
            }

            if (~arg1.field9619 != -3) {
               if (arg1.field9619 == 3) {
                  arg1.field9495 = arg1.field9582 * arg2 >> 14;
                  if (!var4) {
                     break label133;
                  }
               }

               if (arg1.field9619 != 4) {
                  arg1.field9495 = -arg1.field9629 + arg2 + -(arg1.field9582 * arg2 >> 14);
                  if (!var4) {
                     break label133;
                  }
               }

               arg1.field9495 = (arg1.field9582 * arg2 >> 14) + (-arg1.field9629 + arg2) / 2;
               if (!var4) {
                  break label133;
               }
            }

            arg1.field9495 = -arg1.field9582 + arg2 + -arg1.field9629;
         }

         if (class497.field6955) {
            if (~client.method999(arg1).field10630 != -1 || ~arg1.field9493 == -1) {
               label84: {
                  if (~arg1.field9495 > -1) {
                     arg1.field9495 = 0;
                     if (!var4) {
                        break label84;
                     }
                  }

                  if (arg1.field9629 + arg1.field9495 > arg2) {
                     arg1.field9495 = -arg1.field9629 + arg2;
                  }
               }

               if (~arg1.field9570 <= -1) {
                  if (arg0 < arg1.field9572 + arg1.field9570) {
                     arg1.field9570 = -arg1.field9572 + arg0;
                     return;
                  }
               } else {
                  arg1.field9570 = 0;
               }
            }

         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field10175[5] + arg0 + ',' + (arg1 != null ? field10175[4] : field10175[6]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(BJ)V"
   )
   public static final void method5055(byte arg0, long arg1) {
      try {
         int var3 = -27 % ((-1 - arg0) / 42);
         class585.field8632.setTime(new Date(arg1));
         ++field10166;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field10175[1] + arg0 + ',' + arg1 + ')');
      }
   }

   static {
      for(int var0 = 0; ~var0 > -27; ++var0) {
         field10168[var0] = (char)(var0 + 65);
      }

      for(int var1 = 26; ~var1 > -53; ++var1) {
         field10168[var1] = (char)(var1 + 97 - 26);
      }

      for(int var2 = 52; var2 < 62; ++var2) {
         field10168[var2] = (char)(var2 + 48 + -52);
      }

      field10168[63] = '-';
      field10168[62] = '*';
      field10170 = new class407(4);
      field10173 = false;
   }

   @OriginalMember(
      owner = "client!tj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5056(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 35);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5057(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 35;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
