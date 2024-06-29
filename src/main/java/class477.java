import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class477 {
   @OriginalMember(
      owner = "client!jea",
      name = "q",
      descriptor = "Luda;"
   )
   private class478 field6850;
   @OriginalMember(
      owner = "client!jea",
      name = "b",
      descriptor = "I"
   )
   private int field6860;
   @OriginalMember(
      owner = "client!jea",
      name = "r",
      descriptor = "I"
   )
   private int field6847;
   @OriginalMember(
      owner = "client!jea",
      name = "g",
      descriptor = "Lwv;"
   )
   private class37 field6851;
   @OriginalMember(
      owner = "client!jea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6865 = new String[]{method3481(method3480("]LZ0\u001e\u001f")), method3481(method3480("]LZ0\u0013\u001f")), method3481(method3480("Y\\Wr")), method3481(method3480("L\u0007\u00150$")), method3481(method3480("]LZ0\u001b\u001f")), method3481(method3480("]LZ0\u001d\u001f")), method3481(method3480("D\u0017Xm")), method3481(method3480("]LZ0\u0018\u001f")), method3481(method3480("]LZ0\u001a\u001f")), method3481(method3480("]LZ0\u001f\u001f")), method3481(method3480("]LZ0\u001c\u001f")), method3481(method3480("]LZ0e^GRjg\u001f")), method3481(method3480("]LZ0\u0010\u001f")), method3481(method3480("]LZ0\u0011\u001f")), method3481(method3480("]LZ0\u0012\u001f"))};
   @OriginalMember(
      owner = "client!jea",
      name = "i",
      descriptor = "Leg;"
   )
   public static class118 field6856 = new class118(135, 2);
   @OriginalMember(
      owner = "client!jea",
      name = "k",
      descriptor = "I"
   )
   public static int field6864 = 1403;
   @OriginalMember(
      owner = "client!jea",
      name = "o",
      descriptor = "Lbo;"
   )
   public static class762 field6863 = new class762();
   @OriginalMember(
      owner = "client!jea",
      name = "p",
      descriptor = "I"
   )
   public static int field6848;
   @OriginalMember(
      owner = "client!jea",
      name = "j",
      descriptor = "I"
   )
   public static int field6849;
   @OriginalMember(
      owner = "client!jea",
      name = "c",
      descriptor = "I"
   )
   public static int field6852;
   @OriginalMember(
      owner = "client!jea",
      name = "h",
      descriptor = "I"
   )
   public static int field6853;
   @OriginalMember(
      owner = "client!jea",
      name = "a",
      descriptor = "I"
   )
   public static int field6854;
   @OriginalMember(
      owner = "client!jea",
      name = "m",
      descriptor = "I"
   )
   public static int field6855;
   @OriginalMember(
      owner = "client!jea",
      name = "f",
      descriptor = "I"
   )
   public static int field6857;
   @OriginalMember(
      owner = "client!jea",
      name = "e",
      descriptor = "I"
   )
   public static int field6858;
   @OriginalMember(
      owner = "client!jea",
      name = "l",
      descriptor = "I"
   )
   public static int field6859;
   @OriginalMember(
      owner = "client!jea",
      name = "n",
      descriptor = "I"
   )
   public static int field6861;
   @OriginalMember(
      owner = "client!jea",
      name = "d",
      descriptor = "I"
   )
   public static int field6862;

   @OriginalMember(
      owner = "client!jea",
      name = "a",
      descriptor = "(ZLts;)V"
   )
   private final void method3469(boolean arg0, class562 arg1) {
      try {
         if (arg1 != null) {
            arg1.method3165(118);
            arg1.method693((byte)-64);
            this.field6860 += arg1.field8024;
         }

         if (arg0) {
            this.method3475((class107)null, true);
         }

         ++field6855;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6865[12] + arg0 + ',' + (arg1 != null ? field6865[3] : field6865[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jea",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method3470(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jea",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3471(int arg0) {
      try {
         if (arg0 == 0) {
            field6863 = null;
            field6856 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6865[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jea",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method3472(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         if (class525.field7529 != null) {
            class562 var4 = (class562)this.field6850.method3488((byte)-117);
            if (var3 || var4 != null) {
               do {
                  label40: {
                     if (!var4.method2448(0)) {
                        if ((long)arg1 >= ++var4.field947) {
                           break label40;
                        }

                        class562 var5 = class525.field7529.method848(-1, var4);
                        this.field6851.method336(-1, var4.field6137, var5);
                        class542.method3899((byte)-33, var4, var5);
                        var4.method3165(126);
                        var4.method693((byte)-95);
                        if (!var3) {
                           break label40;
                        }
                     }

                     if (var4.method2447(90) == null) {
                        var4.method3165(123);
                        var4.method693((byte)-78);
                        this.field6860 += var4.field8024;
                     }
                  }

                  var4 = (class562)this.field6850.method3484(0);
               } while(var4 != null);
            }
         }

         ++field6857;
         if (arg0 != 1) {
            field6863 = null;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field6865[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jea",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method3473(int arg0) {
      try {
         if (arg0 != 13629) {
            this.field6851 = null;
         }

         ++field6849;
         return this.field6860;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6865[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jea",
      name = "a",
      descriptor = "(Liv;I)Ljava/lang/Object;"
   )
   public final Object method3474(class107 arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field6852;
         long var4 = arg0.method877(arg1 ^ 29287);
         if (arg1 != -29243) {
            this.field6851 = null;
         }

         class562 var6;
         Object var7;
         label70: {
            var6 = (class562)this.field6851.method329((byte)107, var4);
            if (var3) {
               if (var6.field8026.method878(4776, arg0)) {
                  var7 = var6.method2447(107);
                  if (var7 != null) {
                     break label70;
                  }

                  var6.method3165(123);
                  var6.method693((byte)-40);
                  this.field6860 += var6.field8024;
                  if (var3) {
                     break label70;
                  }
               }

               var6 = (class562)this.field6851.method333(false);
            }

            label69:
            while(true) {
               while(var6 != null) {
                  if (var6.field8026.method878(4776, arg0)) {
                     var7 = var6.method2447(107);
                     if (var7 != null) {
                        break label69;
                     }

                     var6.method3165(123);
                     var6.method693((byte)-40);
                     this.field6860 += var6.field8024;
                     if (var3) {
                        break label69;
                     }
                  }

                  var6 = (class562)this.field6851.method333(false);
               }

               if (!var3) {
                  return null;
               }

               var6 = (class562)this.field6851.method333(false);
            }
         }

         if (!var6.method2448(0)) {
            this.field6850.method3486(var6, 1779380172);
            var6.field947 = 0L;
            if (!var3) {
               return var7;
            }
         }

         class331 var8 = new class331(arg0, var7, var6.field8024);
         this.field6851.method336(-1, var6.field6137, var8);
         this.field6850.method3486(var8, 1779380172);
         var8.field947 = 0L;
         var6.method3165(arg1 + 29363);
         var6.method693((byte)-102);
         return var7;
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field6865[10] + (arg0 != null ? field6865[3] : field6865[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jea",
      name = "a",
      descriptor = "(Liv;Z)V"
   )
   private final void method3475(class107 param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jea",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method3476(int arg0) {
      try {
         if (arg0 != 135) {
            this.method3473(15);
         }

         ++field6854;
         return this.field6847;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6865[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jea",
      name = "a",
      descriptor = "(Ljava/lang/Object;ILiv;B)V"
   )
   private final void method3477(Object arg0, int arg1, class107 arg2, byte arg3) {
      boolean var5 = client.field4360;

      try {
         ++field6858;
         if (~this.field6847 > ~arg1) {
            throw new IllegalStateException(field6865[6]);
         } else {
            this.method3475(arg2, true);
            this.field6860 -= arg1;
            class562 var6;
            if (var5) {
               var6 = (class562)this.field6850.method3487(-128);
               this.method3469(false, var6);
            }

            while(this.field6860 < 0) {
               var6 = (class562)this.field6850.method3487(-128);
               this.method3469(false, var6);
            }

            if (arg3 != 48) {
               this.method3469(false, (class562)null);
            }

            class331 var7 = new class331(arg2, arg0, arg1);
            this.field6851.method336(-1, arg2.method877(arg3 + -150), var7);
            this.field6850.method3486(var7, 1779380172);
            var7.field947 = 0L;
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field6865[7] + (arg0 != null ? field6865[3] : field6865[2]) + ',' + arg1 + ',' + (arg2 != null ? field6865[3] : field6865[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jea",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method3478(boolean arg0) {
      try {
         this.field6850.method3490(-1413238680);
         ++field6853;
         this.field6851.method334((byte)126);
         if (arg0) {
            this.method3474((class107)null, -12);
         }

         this.field6860 = this.field6847;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6865[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jea",
      name = "a",
      descriptor = "(Liv;BLjava/lang/Object;)V"
   )
   public final void method3479(class107 arg0, byte arg1, Object arg2) {
      try {
         ++field6859;
         this.method3477(arg2, 1, arg0, (byte)48);
         int var4 = -105 / ((56 - arg1) / 61);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field6865[4] + (arg0 != null ? field6865[3] : field6865[2]) + ',' + arg1 + ',' + (arg2 != null ? field6865[3] : field6865[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jea",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class477(int arg0) {
      boolean var2 = client.field4360;
      super();
      this.field6850 = new class478();

      try {
         this.field6860 = arg0;
         this.field6847 = arg0;
         int var3 = 1;
         if (var2) {
            var3 += var3;
         }

         while(~(var3 - -var3) > ~arg0) {
            var3 += var3;
         }

         this.field6851 = new class37(var3);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field6865[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3480(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3481(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
