import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class287 implements class494 {
   @OriginalMember(
      owner = "client!vea",
      name = "c",
      descriptor = "Lhia;"
   )
   private class73 field4037;
   @OriginalMember(
      owner = "client!vea",
      name = "e",
      descriptor = "[Leu;"
   )
   private class505[] field4030;
   @OriginalMember(
      owner = "client!vea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4039 = new String[]{method2193(method2192("\u00171iX\u001dI")), method2193(method2192("Ly6V")), method2193(method2192("\u00171iX\u0018I")), method2193(method2192("\u00171iX\u001bI")), method2193(method2192("\u00171iX\u001aI")), method2193(method2192("\u00171iX\u0019I")), method2193(method2192("\u00171iX\u001cI")), method2193(method2192("\u001az&X#")), method2193(method2192("\u000f!d\u001a")), method2193(method2192("\u00171iXb\b:a\u0002`I")), method2193(method2192("\u00171iX\u001fI")), method2193(method2192("\u00171iX\u0016I"))};
   @OriginalMember(
      owner = "client!vea",
      name = "g",
      descriptor = "I"
   )
   public static int field4026 = 0;
   @OriginalMember(
      owner = "client!vea",
      name = "f",
      descriptor = "I"
   )
   public static int field4027;
   @OriginalMember(
      owner = "client!vea",
      name = "l",
      descriptor = "I"
   )
   public static int field4029;
   @OriginalMember(
      owner = "client!vea",
      name = "b",
      descriptor = "I"
   )
   public static int field4031;
   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "I"
   )
   public static int field4032;
   @OriginalMember(
      owner = "client!vea",
      name = "d",
      descriptor = "I"
   )
   public static int field4033;
   @OriginalMember(
      owner = "client!vea",
      name = "i",
      descriptor = "I"
   )
   public static int field4034;
   @OriginalMember(
      owner = "client!vea",
      name = "h",
      descriptor = "I"
   )
   public static int field4035;
   @OriginalMember(
      owner = "client!vea",
      name = "m",
      descriptor = "I"
   )
   public static int field4038;
   @OriginalMember(
      owner = "client!vea",
      name = "j",
      descriptor = "Lha;"
   )
   private class66 field4036;
   @OriginalMember(
      owner = "client!vea",
      name = "k",
      descriptor = "Z"
   )
   private boolean field4028;

   @OriginalMember(
      owner = "client!vea",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2184(int arg0) {
      try {
         ++field4033;
         if (arg0 != 30953) {
            this.field4036 = null;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4039[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(IJ)Z"
   )
   public final boolean method2185(int arg0, long arg1) {
      try {
         ++field4034;
         if (arg0 != 10452) {
            return false;
         } else {
            return class188.method1462(true) >= (long)this.field4037.field927 + arg1;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4039[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method2186(int arg0) {
      int var2 = client.field4530;

      try {
         if (arg0 != -31247) {
            field4026 = -6;
         }

         ++field4038;
         int var3 = 0;
         class505[] var4 = this.field4030;
         int var5 = 0;
         if (var2 == 0 && var5 >= var4.length) {
            return var3 * 100 / this.field4030.length;
         } else {
            do {
               class505 var6 = var4[var5];
               if (var6 != null) {
                  if (var6.method168(false)) {
                     ++var3;
                     ++var5;
                  } else {
                     ++var5;
                  }
               } else {
                  ++var3;
                  ++var5;
               }
            } while(var5 < var4.length);

            return var3 * 100 / this.field4030.length;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field4039[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method2187(byte arg0) {
      int var1 = client.field4530;

      try {
         if (arg0 < 41) {
            method2187((byte)126);
         }

         label47: {
            if (class374.field5672 <= 0) {
               class763.field11211 = "";
               if (var1 == 0) {
                  break label47;
               }
            }

            int var2 = 0;
            int var3 = 0;
            if (var1 != 0 || var3 < class784.field11421.length) {
               do {
                  if (class784.field11421[var3].indexOf(field4039[1]) != -1) {
                     ++var2;
                     if (class374.field5672 == var2) {
                        class763.field11211 = class784.field11421[var3].substring(class784.field11421[var3].indexOf(">") + 2);
                        if (var1 == 0) {
                           break;
                        }
                     }
                  }

                  ++var3;
               } while(var3 < class784.field11421.length);
            }
         }

         ++field4027;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4039[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method2188(int arg0) {
      try {
         ++field4031;
         if (arg0 != -3535) {
            this.method2191(false, false);
         }

         return this.field4037.field931;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4039[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2189(int arg0) {
      int var2 = client.field4530;

      try {
         ++field4032;
         if (class786.field11439 != this.field4036) {
            this.field4036 = class786.field11439;
            this.field4028 = true;
         }

         this.field4036.method597(0);
         class505[] var3 = this.field4030;
         if (arg0 != -12552) {
            field4026 = 83;
         }

         int var4 = 0;
         if (var2 != 0 || ~var3.length < ~var4) {
            do {
               class505 var5 = var3[var4];
               if (var5 != null) {
                  var5.method165(25668);
               }

               ++var4;
            } while(~var3.length < ~var4);

         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field4039[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method2190(int arg0, byte arg1) {
      try {
         ++field4029;
         class403 var2 = class453.method3410((long)arg0, true, 16);
         var2.method3096((byte)-81);
         if (arg1 != 117) {
            field4026 = 11;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field4039[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method2191(boolean arg0, boolean arg1) {
      int var3 = client.field4530;

      try {
         ++field4035;
         boolean var9 = arg1;
         class505[] var4 = this.field4030;
         int var5 = 0;
         if (var3 == 0 && var5 >= var4.length) {
            this.field4028 = false;
         } else {
            do {
               class505 var6 = var4[var5];
               if (var6 != null) {
                  var6.method90(!var9 ? this.field4028 : true, 6);
                  ++var5;
               } else {
                  ++var5;
               }
            } while(var5 < var4.length);

            this.field4028 = false;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field4039[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "<init>",
      descriptor = "(Lhia;Lqia;)V"
   )
   public class287(class73 param1, class23 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2192(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 94);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2193(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 84;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 94;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
