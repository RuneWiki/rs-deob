import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public abstract class class757 extends class247 {
   @OriginalMember(
      owner = "client!pha",
      name = "y",
      descriptor = "I"
   )
   public int field10820;
   @OriginalMember(
      owner = "client!pha",
      name = "l",
      descriptor = "I"
   )
   public int field10822;
   @OriginalMember(
      owner = "client!pha",
      name = "j",
      descriptor = "I"
   )
   public int field10819;
   @OriginalMember(
      owner = "client!pha",
      name = "r",
      descriptor = "F"
   )
   public float field10818;
   @OriginalMember(
      owner = "client!pha",
      name = "w",
      descriptor = "I"
   )
   private int field10825;
   @OriginalMember(
      owner = "client!pha",
      name = "m",
      descriptor = "I"
   )
   private int field10830;
   @OriginalMember(
      owner = "client!pha",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10834 = new String[]{method5476(method5475("\u001e\u0018U;\u0002F")), method5476(method5475("\u0000\u0005Xy")), method5476(method5475("\u0015^\u001a;1")), method5476(method5475("\u001e\u0018U;\u0007F")), method5476(method5475("\u001e\u0018U;\u0000F")), method5476(method5475("\u001e\u0018U;\u0006F")), method5476(method5475("\u001e\u0018U;\u0004F")), method5476(method5475("NX")), method5476(method5475("R\u0013[yq\b\u0016Rs|^N")), method5476(method5475("\u001e\u0018U;\u0001F")), method5476(method5475("N]\n5p\r\u001fX(*\b\u0016R%|P")), method5476(method5475("\u001e\u0018U;\u001dF")), method5476(method5475("\u001e\u0018U;\u0003F")), method5476(method5475("\u001e\u0018U;p\u0007\u001e]arF")), method5476(method5475("\u001e\u0018U;\u001cF")), method5476(method5475("\u001e\u0018U;\u0005F"))};
   @OriginalMember(
      owner = "client!pha",
      name = "q",
      descriptor = "I"
   )
   public static int field10817;
   @OriginalMember(
      owner = "client!pha",
      name = "p",
      descriptor = "I"
   )
   public static int field10821;
   @OriginalMember(
      owner = "client!pha",
      name = "o",
      descriptor = "I"
   )
   public static int field10823;
   @OriginalMember(
      owner = "client!pha",
      name = "u",
      descriptor = "I"
   )
   public static int field10824;
   @OriginalMember(
      owner = "client!pha",
      name = "n",
      descriptor = "I"
   )
   public static int field10826;
   @OriginalMember(
      owner = "client!pha",
      name = "t",
      descriptor = "I"
   )
   public static int field10827;
   @OriginalMember(
      owner = "client!pha",
      name = "v",
      descriptor = "I"
   )
   public static int field10828;
   @OriginalMember(
      owner = "client!pha",
      name = "z",
      descriptor = "I"
   )
   public static int field10829;
   @OriginalMember(
      owner = "client!pha",
      name = "s",
      descriptor = "I"
   )
   public static int field10831;
   @OriginalMember(
      owner = "client!pha",
      name = "x",
      descriptor = "I"
   )
   public static int field10832;
   @OriginalMember(
      owner = "client!pha",
      name = "k",
      descriptor = "I"
   )
   public static int field10833;

   @OriginalMember(
      owner = "client!pha",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method5465(byte arg0) {
      try {
         int var2 = -22 / ((56 - arg0) / 32);
         ++field10833;
         return this.field10830;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10834[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "b",
      descriptor = "(Z)I"
   )
   public final int method5466(boolean arg0) {
      try {
         ++field10824;
         if (!arg0) {
            this.field10820 = -51;
         }

         return this.field10825;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10834[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;"
   )
   public static final String[] method5467(int arg0, String arg1, char arg2) {
      boolean var3 = client.field10022;

      try {
         ++field10826;
         int var4 = class229.method2033(arg2, 51, arg1);
         String[] var5 = new String[var4 + 1];
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;
         int var10000;
         int var9;
         if (var3) {
            var9 = var7;
            if (var3) {
               var9 = var7 + 1;
            }
         } else {
            if (~var4 >= ~var8) {
               var10000 = arg0;
               if (!var3) {
                  if (arg0 != 5) {
                     method5473((byte)119, (class307)null);
                  }

                  var5[var4] = arg1.substring(var7);
                  return var5;
               }
            } else {
               var10000 = var7;
            }

            var9 = var10000;
            if (var3) {
               ++var9;
            }
         }

         while(true) {
            while(arg1.charAt(var9) != arg2) {
               ++var9;
            }

            var5[var6++] = arg1.substring(var7, var9);
            var7 = var9 + 1;
            ++var8;
            if (~var4 >= ~var8) {
               var10000 = arg0;
               if (!var3) {
                  if (arg0 != 5) {
                     method5473((byte)119, (class307)null);
                  }

                  var5[var4] = arg1.substring(var7);
                  return var5;
               }
            } else {
               var10000 = var7;
            }

            var9 = var10000;
            if (var3) {
               ++var9;
            }
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field10834[5] + arg0 + ',' + (arg1 != null ? field10834[2] : field10834[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "(Leq;ZB)V"
   )
   public static final void method5468(class799 param0, boolean param1, byte param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method5469(byte arg0) {
      try {
         ++field10827;
         if (arg0 != 13) {
            this.method5465((byte)29);
         }

         return this.field10822;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10834[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method5470(boolean arg0) {
      try {
         ++field10831;
         return !arg0 ? 13 : this.field10819;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10834[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "(I)F"
   )
   public final float method5471(int arg0) {
      try {
         ++field10828;
         if (arg0 != 0) {
            this.field10825 = 68;
         }

         return this.field10818;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10834[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "(Lrb;IBII)V"
   )
   public static final void method5472(class381 arg0, int arg1, byte arg2, int arg3, int arg4) {
      try {
         arg0.field5570.method636(false, arg1);
         if (arg2 < -78) {
            ++field10832;
            arg0.field5570.method661(-116, arg4);
            arg0.field5570.method636(false, arg3);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field10834[15] + (arg0 != null ? field10834[2] : field10834[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "(IIII)V"
   )
   public abstract void method120(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "(BLnj;)V"
   )
   public static final void method5473(byte param0, class307 param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "(FB)V"
   )
   public abstract void method115(float arg0, byte arg1);

   @OriginalMember(
      owner = "client!pha",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method5474(int arg0) {
      try {
         if (arg0 != 10368) {
            this.field10819 = 117;
         }

         ++field10817;
         return this.field10820;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10834[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "<init>",
      descriptor = "(IIIIIF)V"
   )
   public class757(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      try {
         this.field10820 = arg0;
         this.field10822 = arg2;
         this.field10819 = arg1;
         this.field10818 = arg5;
         this.field10825 = arg4;
         this.field10830 = arg3;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field10834[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5475(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5476(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 112;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
