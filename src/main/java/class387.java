import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class387 {
   @OriginalMember(
      owner = "client!ll",
      name = "m",
      descriptor = "Loh;"
   )
   public class428 field5611 = new class428();
   @OriginalMember(
      owner = "client!ll",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5619 = new String[]{method2944(method2943("\u0011[{\u000eQ")), method2944(method2943("\u0006\u0019{c\u0004")), method2944(method2943("\u0004\u00009L")), method2944(method2943("\u0006\u0019{g\u0004")), method2944(method2943("\u0006\u0019{j\u0004")), method2944(method2943("\u0006\u0019{k\u0004")), method2944(method2943("\u0006\u0019{i\u0004")), method2944(method2943("\u0006\u0019{l\u0004")), method2944(method2943("\u0006\u0019{d\u0004")), method2944(method2943("\u0006\u0019{f\u0004")), method2944(method2943("\u0006\u0019{\u001cE\u0004\u001c!\u001e\u0004")), method2944(method2943("\u0006\u0019{n\u0004")), method2944(method2943("\u0006\u0019{a\u0004")), method2944(method2943("\u0006\u0019{e\u0004")), method2944(method2943("\u0006\u0019{b\u0004")), method2944(method2943("\u0006\u0019{h\u0004")), method2944(method2943("\u0006\u0019{m\u0004")), method2944(method2943("\u0006\u0019{o\u0004"))};
   @OriginalMember(
      owner = "client!ll",
      name = "l",
      descriptor = "Z"
   )
   public static boolean field5602 = false;
   @OriginalMember(
      owner = "client!ll",
      name = "g",
      descriptor = "I"
   )
   public static int field5604 = 0;
   @OriginalMember(
      owner = "client!ll",
      name = "n",
      descriptor = "I"
   )
   public static int field5598;
   @OriginalMember(
      owner = "client!ll",
      name = "r",
      descriptor = "I"
   )
   public static int field5599;
   @OriginalMember(
      owner = "client!ll",
      name = "u",
      descriptor = "I"
   )
   public static int field5600;
   @OriginalMember(
      owner = "client!ll",
      name = "b",
      descriptor = "I"
   )
   public static int field5603;
   @OriginalMember(
      owner = "client!ll",
      name = "c",
      descriptor = "I"
   )
   public static int field5605;
   @OriginalMember(
      owner = "client!ll",
      name = "t",
      descriptor = "I"
   )
   public static int field5606;
   @OriginalMember(
      owner = "client!ll",
      name = "i",
      descriptor = "I"
   )
   public static int field5607;
   @OriginalMember(
      owner = "client!ll",
      name = "e",
      descriptor = "I"
   )
   public static int field5608;
   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "I"
   )
   public static int field5609;
   @OriginalMember(
      owner = "client!ll",
      name = "k",
      descriptor = "I"
   )
   public static int field5610;
   @OriginalMember(
      owner = "client!ll",
      name = "f",
      descriptor = "I"
   )
   public static int field5612;
   @OriginalMember(
      owner = "client!ll",
      name = "h",
      descriptor = "I"
   )
   public static int field5613;
   @OriginalMember(
      owner = "client!ll",
      name = "q",
      descriptor = "I"
   )
   public static int field5616;
   @OriginalMember(
      owner = "client!ll",
      name = "d",
      descriptor = "I"
   )
   public static int field5617;
   @OriginalMember(
      owner = "client!ll",
      name = "j",
      descriptor = "Lkf;"
   )
   public static class266 field5601;
   @OriginalMember(
      owner = "client!ll",
      name = "p",
      descriptor = "Loh;"
   )
   private class428 field5614;
   @OriginalMember(
      owner = "client!ll",
      name = "o",
      descriptor = "Llh;"
   )
   public static class555 field5618;
   @OriginalMember(
      owner = "client!ll",
      name = "s",
      descriptor = "Z"
   )
   public static boolean field5615;

   @OriginalMember(
      owner = "client!ll",
      name = "b",
      descriptor = "(B)Loh;",
      line = 5
   )
   public final class428 method2928(byte arg0) {
      try {
         if (arg0 != -24) {
            return null;
         } else {
            ++field5608;
            class428 var2 = this.field5614;
            if (this.field5611 == var2) {
               this.field5614 = null;
               return null;
            } else {
               this.field5614 = var2.field6130;
               return var2;
            }
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5619[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(III)Z",
      line = 26
   )
   public static final boolean method2929(int arg0, int arg1, int arg2) {
      try {
         ++field5598;
         if (!class199.method1570(arg1 + 10194, arg0, arg2)) {
            return false;
         } else {
            return class600.method4361(arg2, arg0, true) | (arg2 & 36864) != arg1 | class279.method2130(arg0, arg2, -1) ? true : (55 & arg0) == 0 & (~(arg2 & 8192) != -1 | class172.method1400(arg2, 21923, arg0) | class83.method744(arg0, arg2, arg1 + -17694));
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5619[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(BLoh;)V",
      line = 53
   )
   public final void method2930(byte arg0, class428 arg1) {
      try {
         ++field5599;
         if (arg1.field6130 != null) {
            arg1.method3165(125);
         }

         if (arg0 >= -37) {
            field5618 = null;
         }

         arg1.field6130 = this.field5611.field6130;
         arg1.field6126 = this.field5611;
         arg1.field6130.field6126 = arg1;
         arg1.field6126.field6130 = arg1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5619[8] + arg0 + ',' + (arg1 != null ? field5619[0] : field5619[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(Lll;ZLoh;)V",
      line = 71
   )
   private final void method2931(class387 arg0, boolean arg1, class428 arg2) {
      try {
         ++field5606;
         class428 var4 = this.field5611.field6130;
         this.field5611.field6130 = arg2.field6130;
         arg2.field6130.field6126 = this.field5611;
         if (arg1) {
            this.field5611 = null;
         }

         if (this.field5611 != arg2) {
            arg2.field6130 = arg0.field5611.field6130;
            arg2.field6130.field6126 = arg2;
            arg0.field5611.field6130 = var4;
            var4.field6126 = arg0.field5611;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5619[1] + (arg0 != null ? field5619[0] : field5619[2]) + ',' + arg1 + ',' + (arg2 != null ? field5619[0] : field5619[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(ILoh;)V",
      line = 93
   )
   public final void method2932(int arg0, class428 arg1) {
      try {
         ++field5600;
         if (arg1.field6130 != null) {
            arg1.method3165(109);
         }

         arg1.field6130 = this.field5611;
         arg1.field6126 = this.field5611.field6126;
         if (arg0 != -17488) {
            field5618 = null;
         }

         arg1.field6130.field6126 = arg1;
         arg1.field6126.field6130 = arg1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5619[4] + arg0 + ',' + (arg1 != null ? field5619[0] : field5619[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "b",
      descriptor = "(I)Loh;",
      line = 114
   )
   public final class428 method2933(int arg0) {
      try {
         if (arg0 != 2) {
            this.method2930((byte)68, (class428)null);
         }

         ++field5612;
         class428 var2 = this.field5611.field6126;
         if (this.field5611 == var2) {
            this.field5614 = null;
            return null;
         } else {
            this.field5614 = var2.field6126;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5619[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "d",
      descriptor = "(I)V",
      line = 138
   )
   public final void method2934(int arg0) {
      boolean var2 = client.field4360;

      try {
         ++field5610;

         while(true) {
            class428 var3 = this.field5611.field6126;
            if (this.field5611 != var3) {
               var3.method3165(117);
               if (var2) {
                  break;
               }

               if (!var2) {
                  continue;
               }
            }

            if (arg0 != 0) {
               field5601 = null;
            }

            this.field5614 = null;
            break;
         }

      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5619[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "b",
      descriptor = "(Z)V",
      line = 161
   )
   public static void method2935(boolean arg0) {
      try {
         field5618 = null;
         if (!arg0) {
            method2937(-85, -74, -85, (byte)95, -121);
         }

         field5601 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5619[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "<init>",
      descriptor = "()V",
      line = 320
   )
   public class387() {
      try {
         this.field5611.field6130 = this.field5611;
         this.field5611.field6126 = this.field5611;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5619[10] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "c",
      descriptor = "(Z)Loh;",
      line = 187
   )
   public final class428 method2936(boolean arg0) {
      try {
         if (arg0) {
            this.method2942(64);
         }

         ++field5616;
         class428 var2 = this.field5611.field6130;
         if (this.field5611 == var2) {
            this.field5614 = null;
            return null;
         } else {
            this.field5614 = var2.field6130;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5619[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(IIIBI)V",
      line = 209
   )
   public static final void method2937(int arg0, int arg1, int arg2, byte arg3, int arg4) {
      try {
         ++field5607;
         int var5 = class256.field3479;
         if (var5 != 0) {
            if (~var5 == -2) {
               class785.field11512 = arg1;
               class397.field5719 = arg0;
               class80.field1036 = arg4;
               class256.field3479 = 2;
               class203.field2888 = arg2;
               return;
            }

            if (~var5 != -3) {
               if (arg3 > -113) {
                  method2935(false);
                  return;
               }

               return;
            }

            if (!client.field4360) {
               if (~arg0 > ~class397.field5719) {
                  class397.field5719 = arg0;
               }

               if (arg1 > class785.field11512) {
                  class785.field11512 = arg1;
               }

               if (~arg2 > ~class203.field2888) {
                  class203.field2888 = arg2;
               }

               if (class80.field1036 < arg4) {
                  class80.field1036 = arg4;
               }

               return;
            }
         }

      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field5619[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(BLll;)V",
      line = 270
   )
   public final void method2938(byte arg0, class387 arg1) {
      try {
         int var3 = 73 / ((arg0 - -84) / 33);
         this.method2931(arg1, false, this.field5611.field6126);
         ++field5617;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5619[16] + arg0 + ',' + (arg1 != null ? field5619[0] : field5619[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(B)I",
      line = 280
   )
   public final int method2939(byte arg0) {
      boolean var2 = client.field4360;

      try {
         ++field5603;
         int var3 = 0;
         if (arg0 != 86) {
            return 77;
         } else {
            class428 var4 = this.field5611.field6126;
            if (var2) {
               var4 = var4.field6126;
               ++var3;
            }

            while(true) {
               while(this.field5611 != var4) {
                  var4 = var4.field6126;
                  ++var3;
               }

               if (!var2) {
                  return var3;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5619[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(Z)Loh;",
      line = 301
   )
   public final class428 method2940(boolean arg0) {
      try {
         ++field5613;
         class428 var2 = this.field5614;
         if (this.field5611 == var2) {
            this.field5614 = null;
            return null;
         } else {
            if (arg0) {
               field5601 = null;
            }

            this.field5614 = var2.field6126;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5619[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "c",
      descriptor = "(I)Loh;",
      line = 332
   )
   public final class428 method2941(int arg0) {
      try {
         if (arg0 != -14002) {
            this.method2932(-80, (class428)null);
         }

         ++field5609;
         class428 var2 = this.field5611.field6126;
         if (this.field5611 == var2) {
            return null;
         } else {
            var2.method3165(126);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5619[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(I)Z",
      line = 352
   )
   public final boolean method2942(int arg0) {
      try {
         if (arg0 != 0) {
            this.method2936(true);
         }

         ++field5605;
         return this.field5611.field6126 == this.field5611;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5619[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2943(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ll",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2944(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 106;
            break;
         case 1:
            var10005 = 117;
            break;
         case 2:
            var10005 = 85;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
