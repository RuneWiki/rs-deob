import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class481 {
   @OriginalMember(
      owner = "client!rfa",
      name = "g",
      descriptor = "I"
   )
   public int field7301 = 0;
   @OriginalMember(
      owner = "client!rfa",
      name = "h",
      descriptor = "I"
   )
   public int field7312 = 0;
   @OriginalMember(
      owner = "client!rfa",
      name = "s",
      descriptor = "Z"
   )
   private boolean field7302 = false;
   @OriginalMember(
      owner = "client!rfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7320 = new String[]{method3739(method3738("}Y\u0013\\w'")), method3739(method3738("}Y\u0013\\p'")), method3739(method3738("aJ\u001e\u001e")), method3739(method3738("t\u0011\\\\O")), method3739(method3738("}Y\u0013\\q'")), method3739(method3738("}Y\u0013\\v'")), method3739(method3738("}Y\u0013\\s'"))};
   @OriginalMember(
      owner = "client!rfa",
      name = "b",
      descriptor = "Ltia;"
   )
   public static class208 field7315 = new class208();
   @OriginalMember(
      owner = "client!rfa",
      name = "m",
      descriptor = "Lnaa;"
   )
   public static class113 field7318 = new class113(54, 1);
   @OriginalMember(
      owner = "client!rfa",
      name = "o",
      descriptor = "[I"
   )
   public static int[] field7319 = new int[3];
   @OriginalMember(
      owner = "client!rfa",
      name = "r",
      descriptor = "I"
   )
   public int field7299;
   @OriginalMember(
      owner = "client!rfa",
      name = "p",
      descriptor = "I"
   )
   public int field7300;
   @OriginalMember(
      owner = "client!rfa",
      name = "i",
      descriptor = "I"
   )
   public int field7303;
   @OriginalMember(
      owner = "client!rfa",
      name = "u",
      descriptor = "I"
   )
   public int field7304;
   @OriginalMember(
      owner = "client!rfa",
      name = "d",
      descriptor = "I"
   )
   public static int field7305;
   @OriginalMember(
      owner = "client!rfa",
      name = "j",
      descriptor = "I"
   )
   public static int field7306;
   @OriginalMember(
      owner = "client!rfa",
      name = "a",
      descriptor = "I"
   )
   public int field7307;
   @OriginalMember(
      owner = "client!rfa",
      name = "t",
      descriptor = "I"
   )
   private int field7308;
   @OriginalMember(
      owner = "client!rfa",
      name = "c",
      descriptor = "I"
   )
   public static int field7309;
   @OriginalMember(
      owner = "client!rfa",
      name = "q",
      descriptor = "I"
   )
   public int field7310;
   @OriginalMember(
      owner = "client!rfa",
      name = "k",
      descriptor = "I"
   )
   public static int field7313;
   @OriginalMember(
      owner = "client!rfa",
      name = "l",
      descriptor = "I"
   )
   public int field7314;
   @OriginalMember(
      owner = "client!rfa",
      name = "f",
      descriptor = "I"
   )
   public int field7316;
   @OriginalMember(
      owner = "client!rfa",
      name = "n",
      descriptor = "I"
   )
   public int field7317;
   @OriginalMember(
      owner = "client!rfa",
      name = "e",
      descriptor = "J"
   )
   public long field7311;

   @OriginalMember(
      owner = "client!rfa",
      name = "a",
      descriptor = "(ZIZI[[[Lika;I)Z",
      line = 9
   )
   public static final boolean method3733(boolean param0, int param1, boolean param2, int param3, class190[][][] param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "a",
      descriptor = "(ZILica;)V",
      line = 336
   )
   private final void method3734(boolean arg0, int arg1, class354 arg2) {
      try {
         if (arg0) {
            ++field7309;
            if (arg1 == 1) {
               this.field7308 = arg2.method2848(-105);
            } else if (~arg1 != -3) {
               if (arg1 == 3) {
                  this.field7303 = arg2.method2894(98);
                  this.field7304 = arg2.method2894(119);
                  this.field7316 = arg2.method2894(115);
               } else {
                  if (arg1 != 4) {
                     if (~arg1 == -7) {
                        this.field7307 = arg2.method2855(-31007);
                        return;
                     }

                     if (~arg1 == -9) {
                        this.field7312 = 1;
                        return;
                     }

                     if (arg1 == 9) {
                        this.field7301 = 1;
                        return;
                     }

                     if (arg1 == 10) {
                        this.field7302 = true;
                        return;
                     }
                  } else {
                     this.field7299 = arg2.method2855(-31007);
                     this.field7300 = arg2.method2894(100);
                  }

               }
            } else {
               arg2.method2855(-31007);
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7320[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7320[3] : field7320[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "a",
      descriptor = "(ILica;)V",
      line = 391
   )
   public final void method3735(int arg0, class354 arg1) {
      boolean var3 = client.field1786;

      try {
         ++field7313;
         int var4 = 72 / ((arg0 - -15) / 59);

         do {
            int var5 = arg1.method2855(-31007);
            if (~var5 == -1) {
               break;
            }

            this.method3734(true, var5, arg1);
         } while(!var3);

      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field7320[4] + arg0 + ',' + (arg1 != null ? field7320[3] : field7320[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "a",
      descriptor = "(I)V",
      line = 410
   )
   public static void method3736(int arg0) {
      try {
         field7319 = null;
         if (arg0 <= 88) {
            method3736(48);
         }

         field7318 = null;
         field7315 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7320[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "a",
      descriptor = "(Z)V",
      line = 434
   )
   public final void method3737(boolean arg0) {
      boolean var2 = client.field1786;

      try {
         ++field7306;
         this.field7317 = class83.field1194[this.field7308 << 3];
         long var3 = (long)this.field7303;
         long var5 = (long)this.field7304;
         long var7 = (long)this.field7316;
         this.field7314 = (int)Math.sqrt((double)(var3 * var3 + var5 * var5 + var7 * var7));
         if (this.field7300 == 0) {
            this.field7300 = 1;
         }

         if (!arg0) {
            method3736(-63);
         }

         label46: {
            if (this.field7299 == 0) {
               this.field7311 = 2147483647L;
               if (!var2) {
                  break label46;
               }
            }

            if (this.field7299 != 1) {
               if (~this.field7299 != -3) {
                  break label46;
               }

               this.field7311 = (long)(this.field7314 * 8 / this.field7300);
               if (!var2) {
                  break label46;
               }
            }

            this.field7311 = (long)(this.field7314 * 8 / this.field7300);
            this.field7311 *= this.field7311;
         }

         if (this.field7302) {
            this.field7314 *= -1;
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field7320[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3738(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3739(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 63;
            break;
         case 2:
            var10005 = 114;
            break;
         case 3:
            var10005 = 114;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
