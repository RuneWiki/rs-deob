import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class59 {
   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "Z"
   )
   public boolean field728 = false;
   @OriginalMember(
      owner = "client!bga",
      name = "h",
      descriptor = "I"
   )
   public int field730 = 2;
   @OriginalMember(
      owner = "client!bga",
      name = "e",
      descriptor = "I"
   )
   public int field729 = 1;
   @OriginalMember(
      owner = "client!bga",
      name = "b",
      descriptor = "I"
   )
   public int field726 = 64;
   @OriginalMember(
      owner = "client!bga",
      name = "k",
      descriptor = "Z"
   )
   public boolean field732 = false;
   @OriginalMember(
      owner = "client!bga",
      name = "g",
      descriptor = "I"
   )
   public int field731 = -1;
   @OriginalMember(
      owner = "client!bga",
      name = "i",
      descriptor = "I"
   )
   public int field735 = 64;
   @OriginalMember(
      owner = "client!bga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field736 = new String[]{method442(method441("FN)\u00017\f")), method442(method441("_\u0007f\u0001\u000e")), method442(method441("FN)\u00016\f")), method442(method441("J\\$C")), method442(method441("FN)\u00010\f")), method442(method441("FN)\u00012\f")), method442(method441("FN)\u00011\f"))};
   @OriginalMember(
      owner = "client!bga",
      name = "c",
      descriptor = "Luk;"
   )
   public static class498 field733 = new class498(48, 0);
   @OriginalMember(
      owner = "client!bga",
      name = "f",
      descriptor = "I"
   )
   public static int field724;
   @OriginalMember(
      owner = "client!bga",
      name = "l",
      descriptor = "I"
   )
   public static int field725;
   @OriginalMember(
      owner = "client!bga",
      name = "j",
      descriptor = "I"
   )
   public static int field727;
   @OriginalMember(
      owner = "client!bga",
      name = "d",
      descriptor = "I"
   )
   public static int field734;

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method436(boolean arg0) {
      try {
         field733 = null;
         if (arg0) {
            field733 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field736[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(IILica;I)V"
   )
   private final void method437(int arg0, int arg1, class354 arg2, int arg3) {
      boolean var5 = client.field1786;

      try {
         if (arg1 != 6005) {
            method436(false);
         }

         label79: {
            if (~arg3 == -2) {
               this.field731 = arg2.method2848(-126);
               if (~this.field731 != -65536) {
                  break label79;
               }

               this.field731 = -1;
               if (!var5) {
                  break label79;
               }
            }

            if (~arg3 == -3) {
               this.field726 = arg2.method2848(-99) - -1;
               this.field735 = arg2.method2848(arg1 + -6129) - -1;
               if (!var5) {
                  break label79;
               }
            }

            if (~arg3 == -4) {
               arg2.method2886((byte)88);
               if (!var5) {
                  break label79;
               }
            }

            if (arg3 != 4) {
               if (~arg3 == -6) {
                  this.field729 = arg2.method2855(arg1 + -37012);
                  if (!var5) {
                     break label79;
                  }
               }

               if (arg3 == 6) {
                  this.field728 = true;
                  if (!var5) {
                     break label79;
                  }
               }

               if (~arg3 != -8) {
                  break label79;
               }

               this.field732 = true;
               if (!var5) {
                  break label79;
               }
            }

            this.field730 = arg2.method2855(-31007);
         }

         ++field734;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field736[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field736[1] : field736[3]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(IZLica;)V"
   )
   public final void method438(int arg0, boolean arg1, class354 arg2) {
      boolean var4 = client.field1786;

      try {
         ++field724;

         while(true) {
            int var5 = arg2.method2855(-31007);
            if (~var5 != -1) {
               this.method437(arg0, 6005, arg2, var5);
               if (var4) {
                  break;
               }

               if (!var4) {
                  continue;
               }
            }

            if (arg1) {
               this.field732 = false;
               return;
            }
            break;
         }

      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field736[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field736[1] : field736[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method439(int arg0, int arg1) {
      try {
         if (arg1 <= 17) {
            method440(19, -14, -18, (class752)null, 13, 62);
         }

         ++field727;
         return arg0 == 0 || ~arg0 == -2 || arg0 == 2;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field736[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(IIILff;II)V"
   )
   public static final void method440(int arg0, int arg1, int arg2, class752 arg3, int arg4, int arg5) {
      try {
         ++field725;
         if (arg5 <= arg2 && ~arg1 <= -2 && arg2 <= class513.field7828 + -2 && ~(class475.field7230 + -2) <= ~arg1) {
            if (class711.field10694 == null) {
               return;
            }

            class434 var6 = class401.field6289.method3947(arg4, arg2, arg0, arg1, false);
            if (var6 != null) {
               if (!(var6 instanceof class32)) {
                  if (!(var6 instanceof class423)) {
                     if (!(var6 instanceof class348)) {
                        if (var6 instanceof class640) {
                           ((class640)var6).method4671(arg3, (byte)111);
                           return;
                        }
                     } else {
                        ((class348)var6).method2805(arg3, 6093);
                     }

                     return;
                  }

                  ((class423)var6).method3355(-7749, arg3);
                  return;
               }

               ((class32)var6).method234(-37, arg3);
               return;
            }
         }

      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field736[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field736[1] : field736[3]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method441(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 115);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method442(char[] arg0) {
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
            var10005 = 41;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 47;
            break;
         default:
            var10005 = 115;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
