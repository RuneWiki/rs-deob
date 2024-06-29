import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class37 {
   @OriginalMember(
      owner = "client!rca",
      name = "h",
      descriptor = "Lcm;"
   )
   public class673 field527 = new class673();
   @OriginalMember(
      owner = "client!rca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field533 = new String[]{method293(method292("e:\u000fPc?")), method293(method292("lw@PW")), method293(method292("y,\u0002\u0012")), method293(method292("e:\u000fPm?")), method293(method292("e:\u000fPh?")), method293(method292("e:\u000fPk?")), method293(method292("e:\u000fPl?")), method293(method292("e:\u000fP`?")), method293(method292("e:\u000fPb?")), method293(method292("e:\u000fPn?")), method293(method292("e:\u000fPf?")), method293(method292("e:\u000fP\u0016~7\u0007\n\u0014?")), method293(method292("e:\u000fPa?")), method293(method292("e:\u000fPi?")), method293(method292("e:\u000fPo?")), method293(method292("e:\u000fPg?"))};
   @OriginalMember(
      owner = "client!rca",
      name = "k",
      descriptor = "I"
   )
   public static int field526 = 0;
   @OriginalMember(
      owner = "client!rca",
      name = "a",
      descriptor = "I"
   )
   public static int field516;
   @OriginalMember(
      owner = "client!rca",
      name = "f",
      descriptor = "I"
   )
   public static int field517;
   @OriginalMember(
      owner = "client!rca",
      name = "e",
      descriptor = "I"
   )
   public static int field518;
   @OriginalMember(
      owner = "client!rca",
      name = "g",
      descriptor = "I"
   )
   public static int field519;
   @OriginalMember(
      owner = "client!rca",
      name = "d",
      descriptor = "I"
   )
   public static int field520;
   @OriginalMember(
      owner = "client!rca",
      name = "m",
      descriptor = "I"
   )
   public static int field521;
   @OriginalMember(
      owner = "client!rca",
      name = "l",
      descriptor = "I"
   )
   public static int field523;
   @OriginalMember(
      owner = "client!rca",
      name = "o",
      descriptor = "I"
   )
   public static int field524;
   @OriginalMember(
      owner = "client!rca",
      name = "n",
      descriptor = "I"
   )
   public static int field525;
   @OriginalMember(
      owner = "client!rca",
      name = "b",
      descriptor = "I"
   )
   public static int field528;
   @OriginalMember(
      owner = "client!rca",
      name = "p",
      descriptor = "I"
   )
   public static int field529;
   @OriginalMember(
      owner = "client!rca",
      name = "c",
      descriptor = "I"
   )
   public static int field530;
   @OriginalMember(
      owner = "client!rca",
      name = "q",
      descriptor = "Lcm;"
   )
   private class673 field531;
   @OriginalMember(
      owner = "client!rca",
      name = "j",
      descriptor = "Lkia;"
   )
   public static class93 field522;
   @OriginalMember(
      owner = "client!rca",
      name = "i",
      descriptor = "[Lhg;"
   )
   public static class529[] field532;

   @OriginalMember(
      owner = "client!rca",
      name = "a",
      descriptor = "(ZLcm;)V"
   )
   public final void method279(boolean arg0, class673 arg1) {
      try {
         if (!arg0) {
            ++field524;
            if (arg1.field9975 != null) {
               arg1.method4924(-2970);
            }

            arg1.field9975 = this.field527.field9975;
            arg1.field9972 = this.field527;
            arg1.field9975.field9972 = arg1;
            arg1.field9972.field9975 = arg1;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field533[10] + arg0 + ',' + (arg1 != null ? field533[1] : field533[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "c",
      descriptor = "(I)Lcm;"
   )
   public final class673 method280(int arg0) {
      try {
         ++field525;
         class673 var2 = this.field531;
         if (this.field527 == var2) {
            this.field531 = null;
            return null;
         } else {
            this.field531 = var2.field9975;
            if (arg0 != 0) {
               this.method283((class37)null, (byte)-70);
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field533[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "c",
      descriptor = "(Z)Lcm;"
   )
   public final class673 method281(boolean arg0) {
      try {
         if (!arg0) {
            return null;
         } else {
            ++field528;
            class673 var2 = this.field527.field9972;
            if (this.field527 == var2) {
               return null;
            } else {
               var2.method4924(-2970);
               return var2;
            }
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field533[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method282(int arg0) {
      try {
         field522 = null;
         if (arg0 != -20934) {
            method282(104);
         }

         field532 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field533[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "a",
      descriptor = "(Lrca;B)V"
   )
   public final void method283(class37 arg0, byte arg1) {
      try {
         this.method287(55, this.field527.field9972, arg0);
         ++field517;
         if (arg1 > -64) {
            this.field531 = null;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field533[8] + (arg0 != null ? field533[1] : field533[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "b",
      descriptor = "(B)Lcm;"
   )
   public final class673 method284(byte arg0) {
      try {
         ++field529;
         if (arg0 != 45) {
            return null;
         } else {
            class673 var2 = this.field527.field9975;
            if (this.field527 == var2) {
               this.field531 = null;
               return null;
            } else {
               this.field531 = var2.field9975;
               return var2;
            }
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field533[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method285(byte arg0) {
      try {
         ++field530;
         if (arg0 >= -107) {
            this.field531 = null;
         }

         return this.field527.field9972 == this.field527;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field533[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method286(boolean arg0) {
      boolean var2 = client.field1481;

      try {
         if (!arg0) {
            return 49;
         } else {
            ++field518;
            int var3 = 0;
            class673 var4 = this.field527.field9972;
            if (var2) {
               ++var3;
               var4 = var4.field9972;
            }

            while(true) {
               if (this.field527 == var4) {
                  if (!var2) {
                     return var3;
                  }
               } else {
                  ++var3;
               }

               var4 = var4.field9972;
            }
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field533[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "a",
      descriptor = "(ILcm;Lrca;)V"
   )
   private final void method287(int arg0, class673 arg1, class37 arg2) {
      try {
         ++field516;
         int var4 = 28 / ((arg0 - -58) / 52);
         class673 var5 = this.field527.field9975;
         this.field527.field9975 = arg1.field9975;
         arg1.field9975.field9972 = this.field527;
         if (this.field527 != arg1) {
            arg1.field9975 = arg2.field527.field9975;
            arg1.field9975.field9972 = arg1;
            var5.field9972 = arg2.field527;
            arg2.field527.field9975 = var5;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field533[9] + arg0 + ',' + (arg1 != null ? field533[1] : field533[2]) + ',' + (arg2 != null ? field533[1] : field533[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "b",
      descriptor = "(I)Lcm;"
   )
   public final class673 method288(int arg0) {
      try {
         ++field521;
         class673 var2 = this.field527.field9972;
         if (this.field527 == var2) {
            this.field531 = null;
            return null;
         } else {
            this.field531 = var2.field9972;
            if (arg0 != 0) {
               field532 = null;
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field533[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method289(boolean arg0) {
      boolean var2 = client.field1481;

      try {
         if (!arg0) {
            field526 = 76;
         }

         ++field520;

         while(true) {
            class673 var3 = this.field527.field9972;
            if (this.field527 != var3) {
               var3.method4924(-2970);
               if (var2) {
                  break;
               }

               if (!var2) {
                  continue;
               }
            }

            this.field531 = null;
            break;
         }

      } catch (RuntimeException var5) {
         throw class93.method866(var5, field533[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "d",
      descriptor = "(I)Lcm;"
   )
   public final class673 method290(int arg0) {
      try {
         ++field519;
         if (arg0 != 17958) {
            this.field527 = null;
         }

         class673 var2 = this.field531;
         if (this.field527 == var2) {
            this.field531 = null;
            return null;
         } else {
            this.field531 = var2.field9972;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field533[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "a",
      descriptor = "(Lcm;I)V"
   )
   public final void method291(class673 arg0, int arg1) {
      try {
         if (arg0.field9975 != null) {
            arg0.method4924(-2970);
         }

         ++field523;
         int var3 = -82 / ((-74 - arg1) / 34);
         arg0.field9972 = this.field527.field9972;
         arg0.field9975 = this.field527;
         arg0.field9975.field9972 = arg0;
         arg0.field9972.field9975 = arg0;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field533[3] + (arg0 != null ? field533[1] : field533[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "<init>",
      descriptor = "()V"
   )
   public class37() {
      try {
         this.field527.field9972 = this.field527;
         this.field527.field9975 = this.field527;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field533[11] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method292(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method293(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 23;
            break;
         case 1:
            var10005 = 89;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
