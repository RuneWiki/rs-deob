import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class52 {
   @OriginalMember(
      owner = "client!ic",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field714 = new String[]{method392(method391("t\u001c P3")), method392(method391("fQ :f")), method392(method391("t\u001c Q3")), method392(method391("s\nbx")), method392(method391("p\u0018")), method392(method391("t\u001c V3")), method392(method391("t\u001c U3")), method392(method391("t\u001c W3")), method392(method391("t\u001c R3"))};
   @OriginalMember(
      owner = "client!ic",
      name = "f",
      descriptor = "Lrca;"
   )
   public static class37 field710 = new class37();
   @OriginalMember(
      owner = "client!ic",
      name = "h",
      descriptor = "Lse;"
   )
   public static class6 field711 = new class6(63, -1);
   @OriginalMember(
      owner = "client!ic",
      name = "d",
      descriptor = "I"
   )
   public static int field706;
   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "I"
   )
   public static int field707;
   @OriginalMember(
      owner = "client!ic",
      name = "b",
      descriptor = "I"
   )
   public static int field708;
   @OriginalMember(
      owner = "client!ic",
      name = "c",
      descriptor = "I"
   )
   public static int field709;
   @OriginalMember(
      owner = "client!ic",
      name = "g",
      descriptor = "I"
   )
   public static int field712;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!ic",
      name = "e",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field713;

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method383(int arg0, int arg1, int arg2) {
      class731 var3 = class548.field8080[arg0][arg1][arg2];
      if (var3 != null) {
         class676.method4946(var3.field10649);
         if (var3.field10649 != null) {
            var3.field10649 = null;
         }

      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "(ILha;)V"
   )
   public static final void method384(int arg0, class479 arg1) {
      try {
         if (arg0 == -28354) {
            ++field707;
            if (~class513.field7158 != ~class204.field2593.field10457) {
               if (class548.field8080 != null) {
                  if (class616.method4540(class204.field2593.field10457, false, arg1)) {
                     class513.field7158 = class204.field2593.field10457;
                  }
               }
            }
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field714[5] + arg0 + ',' + (arg1 != null ? field714[1] : field714[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Z"
   )
   public static final boolean method385(String arg0, int arg1) {
      try {
         ++field706;
         int var2 = 8 % ((arg1 - 11) / 47);
         return class524.method3923(arg0, field713 != null ? field713 : (field713 = method390(field714[4])), 70);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field714[2] + (arg0 != null ? field714[1] : field714[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "b",
      descriptor = "(III)Z"
   )
   public static final boolean method386(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != 0) {
            field710 = null;
         }

         ++field712;
         return (arg1 & 24) != 0 | (544 & arg1) == 544;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field714[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "(IZ)I"
   )
   public static final int method387(int arg0, boolean arg1) {
      boolean var2 = client.field1481;

      try {
         ++field709;
         if (class211.field2686 == null) {
            return 0;
         } else if (!arg1 && class91.field1238 != null) {
            return class211.field2686.length * 2;
         } else {
            int var3 = 0;
            int var4 = 119 / ((62 - arg0) / 45);
            int var5 = 0;
            int var10000;
            if (var2) {
               var10000 = class211.field2686[var5];
            } else if (var5 >= class211.field2686.length) {
               var10000 = var3;
               if (!var2) {
                  return var3;
               }
            } else {
               var10000 = class211.field2686[var5];
            }

            while(true) {
               int var6 = var10000;
               if (class258.field3268.method2681((byte)72, var6)) {
                  ++var3;
               }

               if (class28.field414.method2681((byte)74, var6)) {
                  ++var3;
               }

               ++var5;
               if (var5 >= class211.field2686.length) {
                  var10000 = var3;
                  if (!var2) {
                     return var3;
                  }
               } else {
                  var10000 = class211.field2686[var5];
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field714[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "(ILrca;IILha;)V"
   )
   public static final void method388(int arg0, class37 arg1, int arg2, int arg3, class479 arg4) {
      boolean var5 = client.field1481;

      try {
         ++field708;
         class138.field1748.method289(true);
         if (!class137.field1742) {
            if (arg0 > 11) {
               class160 var6 = (class160)arg1.method288(0);
               if (var5 || var6 != null) {
                  do {
                     class519 var7 = class326.field4471.method4937(var6.field2052, true);
                     if (class199.method1651(11, var7)) {
                        boolean var8 = class391.method3091(arg4, arg2, true, var7, var6, arg3);
                        if (var8) {
                           class350.method2782(var7, 124, var6, arg4);
                        }
                     }

                     var6 = (class160)arg1.method290(17958);
                  } while(var6 != null);

               }
            }
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field714[8] + arg0 + ',' + (arg1 != null ? field714[1] : field714[3]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field714[1] : field714[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method389(int arg0) {
      try {
         if (arg0 != 63) {
            field711 = null;
         }

         field710 = null;
         field711 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field714[6] + arg0 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method390(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method391(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method392(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 29;
            break;
         case 1:
            var10005 = 127;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 20;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
