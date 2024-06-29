import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wja")
public class class281 {
   @OriginalMember(
      owner = "client!wja",
      name = "h",
      descriptor = "Lqh;"
   )
   private class74 field3755;
   @OriginalMember(
      owner = "client!wja",
      name = "e",
      descriptor = "Lqh;"
   )
   private class74 field3757;
   @OriginalMember(
      owner = "client!wja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3763 = new String[]{method2149(method2148("?;515`")), method2149(method2148("?;513`")), method2149(method2148("3\u007fz1\u000b")), method2149(method2148("&$8s")), method2149(method2148("?;514`")), method2149(method2148("?;51J!?=kH`")), method2149(method2148("?;512`")), method2149(method2148("?;517`"))};
   @OriginalMember(
      owner = "client!wja",
      name = "f",
      descriptor = "I"
   )
   public static int field3762 = 1339;
   @OriginalMember(
      owner = "client!wja",
      name = "g",
      descriptor = "I"
   )
   public static int field3756;
   @OriginalMember(
      owner = "client!wja",
      name = "a",
      descriptor = "I"
   )
   public static int field3758;
   @OriginalMember(
      owner = "client!wja",
      name = "c",
      descriptor = "I"
   )
   public static int field3759;
   @OriginalMember(
      owner = "client!wja",
      name = "i",
      descriptor = "I"
   )
   public static int field3761;
   @OriginalMember(
      owner = "client!wja",
      name = "d",
      descriptor = "Lir;"
   )
   private class28 field3760;
   @OriginalMember(
      owner = "client!wja",
      name = "b",
      descriptor = "Lqh;"
   )
   public static class74 field3754;

   @OriginalMember(
      owner = "client!wja",
      name = "a",
      descriptor = "(IIIZII)V"
   )
   public static final void method2143(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
      boolean var6 = client.field4273;

      try {
         if (arg0 != 0) {
            method2147((byte)-3);
         }

         ++field3761;
         long var7 = (long)(arg1 | (!arg3 ? 0 : Integer.MIN_VALUE));
         class784 var9 = (class784)class450.field6221.method1839(-125, var7);
         if (var9 == null) {
            var9 = new class784();
            class450.field6221.method1841(var7, true, var9);
         }

         if (arg4 >= var9.field11463.length) {
            int[] var10 = new int[arg4 + 1];
            int[] var11 = new int[arg4 + 1];
            int var12 = 0;
            if (var6) {
               var10[var12] = var9.field11463[var12];
               var11[var12] = var9.field11456[var12];
               ++var12;
            }

            label70:
            while(true) {
               while(~var12 > ~var9.field11463.length) {
                  var10[var12] = var9.field11463[var12];
                  var11[var12] = var9.field11456[var12];
                  ++var12;
               }

               int var13 = var9.field11463.length;
               if (!var6) {
                  if (var6) {
                     var10[var13] = -1;
                     var11[var13] = 0;
                     ++var13;
                  }

                  while(true) {
                     while(var13 < arg4) {
                        var10[var13] = -1;
                        var11[var13] = 0;
                        ++var13;
                     }

                     var9.field11456 = var11;
                     if (!var6) {
                        var9.field11463 = var10;
                        break label70;
                     }

                     ++var13;
                  }
               }

               ++var12;
            }
         }

         var9.field11463[arg4] = arg5;
         var9.field11456[arg4] = arg2;
      } catch (RuntimeException var15) {
         throw class534.method3846(var15, field3763[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wja",
      name = "a",
      descriptor = "(IZ)Lnaa;"
   )
   public static final class78 method2144(int arg0, boolean arg1) {
      try {
         if (!arg1) {
            return null;
         } else {
            ++field3759;
            return class630.field8821 && ~arg0 <= ~class532.field7285 && class697.field10180 >= arg0 ? class580.field7961[arg0 - class532.field7285] : null;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3763[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wja",
      name = "a",
      descriptor = "(Log;B)Laja;"
   )
   public final class99 method2145(class678 arg0, byte arg1) {
      try {
         ++field3758;
         if (arg0 == null) {
            return null;
         } else {
            class365 var3 = arg0.method19(-108);
            if (class283.field3774 == var3) {
               return new class344((class41)arg0);
            } else if (class287.field3797 == var3) {
               return new class473(this.method2146(-112), (class740)arg0);
            } else if (class539.field7364 == var3) {
               return new class435(this.field3755, (class11)arg0);
            } else if (class671.field9869 == var3) {
               return new class760(this.field3755, (class3)arg0);
            } else if (class178.field2206 == var3) {
               return new class125(this.field3755, this.field3757, (class602)arg0);
            } else if (class719.field10533 == var3) {
               return new class294(this.field3755, this.field3757, (class519)arg0);
            } else if (class73.field897 == var3) {
               return new class650(this.field3755, this.field3757, (class498)arg0);
            } else if (class480.field6638 == var3) {
               return new class362(this.field3755, this.field3757, (class141)arg0);
            } else if (class343.field4908 == var3) {
               return new class207(this.field3755, (class51)arg0);
            } else {
               if (arg1 != -71) {
                  this.field3757 = null;
               }

               return class212.field2633 == var3 ? new class109(this.field3755, this.field3757, (class181)arg0) : null;
            }
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field3763[1] + (arg0 != null ? field3763[2] : field3763[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wja",
      name = "a",
      descriptor = "(I)Lir;"
   )
   private final class28 method2146(int arg0) {
      try {
         if (this.field3760 == null) {
            this.field3760 = new class28();
         }

         ++field3756;
         return arg0 > -23 ? null : this.field3760;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3763[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wja",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2147(byte arg0) {
      try {
         field3754 = null;
         int var1 = 68 % ((arg0 - 69) / 56);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3763[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wja",
      name = "<init>",
      descriptor = "(Lqh;Lqh;)V"
   )
   public class281(class74 arg0, class74 arg1) {
      try {
         this.field3755 = arg0;
         this.field3757 = arg1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3763[5] + (arg0 != null ? field3763[2] : field3763[3]) + ',' + (arg1 != null ? field3763[2] : field3763[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2148(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2149(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
