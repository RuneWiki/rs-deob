import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public abstract class class294 extends class246 {
   @OriginalMember(
      owner = "client!vca",
      name = "q",
      descriptor = "Z"
   )
   public boolean field4087 = false;
   @OriginalMember(
      owner = "client!vca",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4104 = new String[]{method2299(method2298("Qw$[8f<")), method2299(method2298("\\:k[\u0004")), method2299(method2298("Qw$[<f<")), method2299(method2298("Ia)\u0019")), method2299(method2298("Qw$[;f<")), method2299(method2298("Qw$[:f<"))};
   @OriginalMember(
      owner = "client!vca",
      name = "s",
      descriptor = "[I"
   )
   public static int[] field4095 = new int[128];
   @OriginalMember(
      owner = "client!vca",
      name = "t",
      descriptor = "Luw;"
   )
   public static class435 field4102;
   @OriginalMember(
      owner = "client!vca",
      name = "v",
      descriptor = "Lca;"
   )
   public static class320 field4103;
   @OriginalMember(
      owner = "client!vca",
      name = "x",
      descriptor = "B"
   )
   public byte field4090;
   @OriginalMember(
      owner = "client!vca",
      name = "p",
      descriptor = "B"
   )
   public byte field4091;
   @OriginalMember(
      owner = "client!vca",
      name = "l",
      descriptor = "I"
   )
   public int field4089;
   @OriginalMember(
      owner = "client!vca",
      name = "o",
      descriptor = "I"
   )
   public static int field4093;
   @OriginalMember(
      owner = "client!vca",
      name = "r",
      descriptor = "I"
   )
   public int field4094;
   @OriginalMember(
      owner = "client!vca",
      name = "j",
      descriptor = "I"
   )
   public int field4096;
   @OriginalMember(
      owner = "client!vca",
      name = "n",
      descriptor = "I"
   )
   public int field4097;
   @OriginalMember(
      owner = "client!vca",
      name = "w",
      descriptor = "I"
   )
   public int field4098;
   @OriginalMember(
      owner = "client!vca",
      name = "k",
      descriptor = "I"
   )
   public static int field4099;
   @OriginalMember(
      owner = "client!vca",
      name = "y",
      descriptor = "I"
   )
   public static int field4100;
   @OriginalMember(
      owner = "client!vca",
      name = "m",
      descriptor = "I"
   )
   public int field4101;
   @OriginalMember(
      owner = "client!vca",
      name = "u",
      descriptor = "Lvca;"
   )
   public class294 field4088;
   @OriginalMember(
      owner = "client!vca",
      name = "z",
      descriptor = "Z"
   )
   public boolean field4092;

   @OriginalMember(
      owner = "client!vca",
      name = "e",
      descriptor = "(B)Z"
   )
   public abstract boolean method593(byte arg0);

   @OriginalMember(
      owner = "client!vca",
      name = "e",
      descriptor = "(I)Z"
   )
   public abstract boolean method588(int arg0);

   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "(IZLvca;Lha;III)V"
   )
   public abstract void method579(int arg0, boolean arg1, class294 arg2, class65 arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!vca",
      name = "c",
      descriptor = "(I)I"
   )
   public abstract int method589(int arg0);

   @OriginalMember(
      owner = "client!vca",
      name = "h",
      descriptor = "(I)V"
   )
   public static void method2295(int arg0) {
      try {
         if (arg0 <= -84) {
            field4103 = null;
            field4102 = null;
            field4095 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4104[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "([Lke;B)I"
   )
   public abstract int method1366(class622[] arg0, byte arg1);

   @OriginalMember(
      owner = "client!vca",
      name = "f",
      descriptor = "(B)I"
   )
   public abstract int method590(byte arg0);

   @OriginalMember(
      owner = "client!vca",
      name = "b",
      descriptor = "(ILha;)Z"
   )
   public abstract boolean method1362(int arg0, class65 arg1);

   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "(IIILha;)Z"
   )
   public abstract boolean method582(int arg0, int arg1, int arg2, class65 arg3);

   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "(ZLha;)V"
   )
   public abstract void method598(boolean arg0, class65 arg1);

   @OriginalMember(
      owner = "client!vca",
      name = "g",
      descriptor = "(I)Z"
   )
   public abstract boolean method601(int arg0);

   @OriginalMember(
      owner = "client!vca",
      name = "c",
      descriptor = "(Lha;I)Lpca;"
   )
   public abstract class744 method586(class65 arg0, int arg1);

   @OriginalMember(
      owner = "client!vca",
      name = "d",
      descriptor = "(I)V"
   )
   public abstract void method594(int arg0);

   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "(ILha;)Lbv;"
   )
   public abstract class321 method599(int arg0, class65 arg1);

   @OriginalMember(
      owner = "client!vca",
      name = "i",
      descriptor = "(I)Z"
   )
   public abstract boolean method1365(int arg0);

   @OriginalMember(
      owner = "client!vca",
      name = "f",
      descriptor = "(I)I"
   )
   public int method2114(int arg0) {
      try {
         ++field4093;
         if (arg0 != 9549) {
            field4095 = null;
         }

         return 0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4104[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "(I[Lke;IZ)I"
   )
   public final int method2296(int arg0, class622[] arg1, int arg2, boolean arg3) {
      boolean var5 = client.field4564;

      try {
         ++field4099;
         if (!arg3) {
            this.method601(-67);
         }

         int var10;
         int var11;
         label60: {
            long var6 = class236.field3434[this.field4090][arg2][arg0];
            long var8 = 0L;
            var10 = 0;
            if (var5) {
               var11 = (int)(var6 >> (int)var8 & 65535L);
            } else if (var8 > 48L) {
               var11 = var10;
               if (!var5) {
                  break label60;
               }
            } else {
               var11 = (int)(var6 >> (int)var8 & 65535L);
            }

            label59:
            do {
               while(true) {
                  if (~var11 >= -1) {
                     if (!var5) {
                        var11 = var10;
                        break;
                     }

                     arg1[var10++] = class234.field3419[var11 - 1].field7826;
                     var8 += 16L;
                  } else {
                     arg1[var10++] = class234.field3419[var11 - 1].field7826;
                     var8 += 16L;
                  }

                  if (var8 > 48L) {
                     var11 = var10;
                     if (!var5) {
                        break label59;
                     }
                  } else {
                     var11 = (int)(var6 >> (int)var8 & 65535L);
                  }
               }
            } while(var5);
         }

         if (var5) {
            arg1[var11] = null;
            ++var11;
         }

         while(true) {
            while(~var11 > -5) {
               arg1[var11] = null;
               ++var11;
            }

            if (!var5) {
               return var10;
            }

            ++var11;
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field4104[2] + arg0 + ',' + (arg1 != null ? field4104[1] : field4104[3]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "(ZZI)V"
   )
   public static final void method2297(boolean arg0, boolean arg1, int arg2) {
      try {
         ++field4100;
         if (arg2 != -18330) {
            field4102 = null;
         }

         if (arg0) {
            ++class328.field4693;
            class432.method3255(360);
         }

         if (arg1) {
            ++class558.field8092;
            class32.method234(6);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4104[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   static {
      for(int var0 = 0; var0 < field4095.length; ++var0) {
         field4095[var0] = -1;
      }

      for(int var1 = 65; ~var1 >= -91; ++var1) {
         field4095[var1] = var1 + -65;
      }

      for(int var2 = 97; var2 <= 122; ++var2) {
         field4095[var2] = var2 + -97 + 26;
      }

      for(int var3 = 48; var3 <= 57; ++var3) {
         field4095[var3] = var3 + -48 + 52;
      }

      field4095[42] = field4095[43] = 62;
      field4095[45] = field4095[47] = 63;
      field4102 = new class435(2, -1);
      field4103 = new class320(method2299(method2298("T` \u0019\u0015Ff!\u0014\u000eI")), method2299(method2298("t` \u0019\u0015Ffe1\u0018Pz")), 1);
   }

   @OriginalMember(
      owner = "client!vca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2298(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2299(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 20;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
