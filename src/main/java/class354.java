import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class354 {
   @OriginalMember(
      owner = "client!rd",
      name = "d",
      descriptor = "J"
   )
   private long field5371;
   @OriginalMember(
      owner = "client!rd",
      name = "l",
      descriptor = "I"
   )
   private int field5368;
   @OriginalMember(
      owner = "client!rd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5378 = new String[]{method2770(method2769("A:~\u0001b")), method2770(method2769("Hp~l7")), method2770(method2769("]+<.")), method2770(method2769("A:~\u0006b")), method2770(method2769("A:~~#]7$|b")), method2770(method2769("A:~\u0005b")), method2770(method2769("A:~\u0000b")), method2770(method2769("A:~\u0003b")), method2770(method2769("A:~\nb")), method2770(method2769("A:~\u0007b")), method2770(method2769("A:~\u0004b")), method2770(method2769("A:~\u000bb"))};
   @OriginalMember(
      owner = "client!rd",
      name = "o",
      descriptor = "[I"
   )
   public static int[] field5364 = new int[4096];
   @OriginalMember(
      owner = "client!rd",
      name = "c",
      descriptor = "I"
   )
   public static int field5375;
   @OriginalMember(
      owner = "client!rd",
      name = "e",
      descriptor = "Lsda;"
   )
   public static class269 field5373;
   @OriginalMember(
      owner = "client!rd",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field5377;
   @OriginalMember(
      owner = "client!rd",
      name = "g",
      descriptor = "I"
   )
   public static int field5362;
   @OriginalMember(
      owner = "client!rd",
      name = "m",
      descriptor = "I"
   )
   public static int field5363;
   @OriginalMember(
      owner = "client!rd",
      name = "p",
      descriptor = "I"
   )
   public static int field5365;
   @OriginalMember(
      owner = "client!rd",
      name = "k",
      descriptor = "I"
   )
   public static int field5366;
   @OriginalMember(
      owner = "client!rd",
      name = "i",
      descriptor = "I"
   )
   public static int field5367;
   @OriginalMember(
      owner = "client!rd",
      name = "j",
      descriptor = "I"
   )
   public static int field5369;
   @OriginalMember(
      owner = "client!rd",
      name = "h",
      descriptor = "I"
   )
   public static int field5370;
   @OriginalMember(
      owner = "client!rd",
      name = "n",
      descriptor = "I"
   )
   public static int field5372;
   @OriginalMember(
      owner = "client!rd",
      name = "f",
      descriptor = "I"
   )
   public static int field5374;
   @OriginalMember(
      owner = "client!rd",
      name = "b",
      descriptor = "I"
   )
   public static int field5376;

   static {
      for(int var0 = 0; var0 < 4096; ++var0) {
         field5364[var0] = class18.method125(var0, (byte)96);
      }

      field5375 = 0;
      field5373 = new class269(76, 6);
      field5377 = false;
   }

   @OriginalMember(
      owner = "client!rd",
      name = "a",
      descriptor = "(ILab;)V",
      line = 4
   )
   private final void method2760(int arg0, class697 arg1) {
      try {
         ++field5376;
         if (arg0 != 1) {
            this.method2761(-49, -87);
         }

         this.field5371 |= (long)(arg1.field10457 << this.field5368++ * class697.field10471);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5378[5] + arg0 + ',' + (arg1 != null ? field5378[1] : field5378[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "a",
      descriptor = "(II)I",
      line = 16
   )
   private final int method2761(int arg0, int arg1) {
      try {
         if (arg0 != 15) {
            field5373 = null;
         }

         ++field5374;
         return (int)(this.field5371 >> class697.field10471 * arg1) & 15;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5378[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "a",
      descriptor = "(BI)Lab;",
      line = 33
   )
   public final class697 method2762(byte arg0, int arg1) {
      try {
         ++field5365;
         if (arg0 != -46) {
            field5373 = null;
         }

         return class697.method5056(this.method2761(15, arg1), (byte)-106);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5378[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "a",
      descriptor = "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V",
      line = 44
   )
   public static final void method2763(int arg0, String arg1, String arg2, int arg3, String arg4, String arg5, boolean arg6, String arg7, int arg8) {
      int var9 = client.field4530;

      try {
         ++field5372;
         if (!arg6) {
            field5375 = -105;
         }

         class58 var10 = class100.field1214[99];
         int var11 = 99;
         if (var9 != 0) {
            class100.field1214[var11] = class100.field1214[var11 - 1];
            --var11;
         }

         while(true) {
            while(~var11 < -1) {
               class100.field1214[var11] = class100.field1214[var11 - 1];
               --var11;
            }

            if (var9 == 0) {
               label53: {
                  if (var10 != null) {
                     var10.method484(arg0, arg3, -1766, arg7, arg2, arg8, arg1, arg5, arg4);
                     if (var9 == 0) {
                        break label53;
                     }
                  }

                  var10 = new class58(arg3, arg0, arg1, arg5, arg2, arg4, arg8, arg7);
               }

               class553.field8200 = class456.field6922;
               ++class734.field10888;
               class100.field1214[0] = var10;
               return;
            }

            --var11;
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field5378[7] + arg0 + ',' + (arg1 != null ? field5378[1] : field5378[2]) + ',' + (arg2 != null ? field5378[1] : field5378[2]) + ',' + arg3 + ',' + (arg4 != null ? field5378[1] : field5378[2]) + ',' + (arg5 != null ? field5378[1] : field5378[2]) + ',' + arg6 + ',' + (arg7 != null ? field5378[1] : field5378[2]) + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "a",
      descriptor = "(IIB)I",
      line = 71
   )
   public static final int method2764(int arg0, int arg1, byte arg2) {
      int var3 = client.field4530;

      try {
         ++field5363;
         int var4 = 0;
         if (arg2 != 37) {
            return 4;
         } else {
            while(true) {
               int var10000;
               if (~arg0 >= -1) {
                  var10000 = var4;
                  if (var3 == 0) {
                     return var4;
                  }
               } else {
                  var4 = var4 << 1 | 1 & arg1;
                  --arg0;
                  var10000 = arg1 >>> 1;
               }

               arg1 = var10000;
            }
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field5378[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "a",
      descriptor = "(I)I",
      line = 104
   )
   public final int method2765(int arg0) {
      try {
         if (arg0 != 18416) {
            field5373 = null;
         }

         ++field5367;
         return this.field5368;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5378[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "a",
      descriptor = "(B)V",
      line = 115
   )
   public static void method2766(byte arg0) {
      try {
         if (arg0 <= 46) {
            field5370 = 0;
         }

         field5373 = null;
         field5364 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5378[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "a",
      descriptor = "(Ljava/lang/String;B)Z",
      line = 128
   )
   public static final boolean method2767(String arg0, byte arg1) {
      try {
         if (arg1 > -64) {
            return false;
         } else {
            ++field5366;
            return class360.field5435.containsKey(arg0);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5378[3] + (arg0 != null ? field5378[1] : field5378[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "<init>",
      descriptor = "(Lab;)V",
      line = 144
   )
   public class354(class697 arg0) {
      try {
         this.field5371 = (long)arg0.field10457;
         this.field5368 = 1;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5378[4] + (arg0 != null ? field5378[1] : field5378[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "<init>",
      descriptor = "([Lab;)V",
      line = 155
   )
   public class354(class697[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rd",
      name = "a",
      descriptor = "(IBIZ)V",
      line = 173
   )
   public static final void method2768(int arg0, byte arg1, int arg2, boolean arg3) {
      try {
         ++field5369;
         if (arg0 >= 8000 && ~arg0 >= -48001) {
            if (arg1 != -19) {
               method2764(-31, 70, (byte)64);
            }

            class137.field1780 = arg2;
            class335.field4787 = arg0;
            class532.field7780 = arg3;
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5378[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2769(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2770(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
