import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class216 {
   @OriginalMember(
      owner = "client!dga",
      name = "n",
      descriptor = "Ljca;"
   )
   private class712 field2736;
   @OriginalMember(
      owner = "client!dga",
      name = "e",
      descriptor = "I"
   )
   private int field2725;
   @OriginalMember(
      owner = "client!dga",
      name = "m",
      descriptor = "I"
   )
   private int field2720;
   @OriginalMember(
      owner = "client!dga",
      name = "r",
      descriptor = "Lwia;"
   )
   private class791 field2731;
   @OriginalMember(
      owner = "client!dga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2738 = new String[]{method1639(method1638("zVC\u000b\u0012w_KQ\u00106")), method1639(method1638("e\u001f\f\u000bS")), method1639(method1638("pDNI")), method1639(method1638("zVC\u000bg6")), method1639(method1638("zVC\u000bj6")), method1639(method1638("zVC\u000bh6")), method1639(method1638("m\u000fAV")), method1639(method1638("zVC\u000bk6")), method1639(method1638("zVC\u000bm6")), method1639(method1638("zVC\u000bf6")), method1639(method1638("zVC\u000bb6")), method1639(method1638("zVC\u000bd6")), method1639(method1638("zVC\u000be6")), method1639(method1638("zVC\u000bl6")), method1639(method1638("zVC\u000bi6")), method1639(method1638("zVC\u000bo6"))};
   @OriginalMember(
      owner = "client!dga",
      name = "j",
      descriptor = "I"
   )
   public static int field2737 = 0;
   @OriginalMember(
      owner = "client!dga",
      name = "l",
      descriptor = "I"
   )
   public static int field2721;
   @OriginalMember(
      owner = "client!dga",
      name = "o",
      descriptor = "I"
   )
   public static int field2722;
   @OriginalMember(
      owner = "client!dga",
      name = "b",
      descriptor = "I"
   )
   public static int field2723;
   @OriginalMember(
      owner = "client!dga",
      name = "q",
      descriptor = "I"
   )
   public static int field2724;
   @OriginalMember(
      owner = "client!dga",
      name = "a",
      descriptor = "I"
   )
   public static int field2726;
   @OriginalMember(
      owner = "client!dga",
      name = "g",
      descriptor = "I"
   )
   public static int field2727;
   @OriginalMember(
      owner = "client!dga",
      name = "k",
      descriptor = "I"
   )
   public static int field2728;
   @OriginalMember(
      owner = "client!dga",
      name = "c",
      descriptor = "I"
   )
   public static int field2729;
   @OriginalMember(
      owner = "client!dga",
      name = "i",
      descriptor = "I"
   )
   public static int field2730;
   @OriginalMember(
      owner = "client!dga",
      name = "h",
      descriptor = "I"
   )
   public static int field2732;
   @OriginalMember(
      owner = "client!dga",
      name = "f",
      descriptor = "I"
   )
   public static int field2733;
   @OriginalMember(
      owner = "client!dga",
      name = "d",
      descriptor = "I"
   )
   public static int field2734;
   @OriginalMember(
      owner = "client!dga",
      name = "p",
      descriptor = "I"
   )
   public static int field2735;

   @OriginalMember(
      owner = "client!dga",
      name = "a",
      descriptor = "(IILjava/lang/Object;Lsf;)V"
   )
   private final void method1626(int arg0, int arg1, Object arg2, class549 arg3) {
      int var5 = client.field4530;

      try {
         ++field2723;
         if (arg0 > this.field2720) {
            throw new IllegalStateException(field2738[6]);
         } else {
            this.method1630(arg3, (byte)115);
            this.field2725 -= arg0;
            class300 var6;
            if (var5 != 0) {
               var6 = (class300)this.field2736.method5161(0);
               this.method1635(0, var6);
            }

            while(~this.field2725 > -1) {
               var6 = (class300)this.field2736.method5161(0);
               this.method1635(0, var6);
            }

            if (arg1 != -1) {
               this.method1626(125, 107, (Object)null, (class549)null);
            }

            class171 var7 = new class171(arg3, arg2, arg0);
            this.field2731.method5682(arg3.method1888((byte)125), var7, (byte)7);
            this.field2736.method5164(var7, (byte)-105);
            var7.field882 = 0L;
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field2738[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2738[1] : field2738[2]) + ',' + (arg3 != null ? field2738[1] : field2738[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dga",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method1627(byte arg0) {
      try {
         int var1 = -29 / ((arg0 - 30) / 56);
         class298.field4137.method5451(-117);
         ++field2726;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2738[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dga",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method1628(int arg0) {
      try {
         if (arg0 != -8257) {
            field2737 = -74;
         }

         ++field2724;
         return this.field2725;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2738[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dga",
      name = "a",
      descriptor = "(BLjava/lang/Object;Lsf;)V"
   )
   public final void method1629(byte arg0, Object arg1, class549 arg2) {
      try {
         if (arg0 != -90) {
            this.field2736 = null;
         }

         ++field2732;
         this.method1626(1, arg0 + 89, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field2738[3] + arg0 + ',' + (arg1 != null ? field2738[1] : field2738[2]) + ',' + (arg2 != null ? field2738[1] : field2738[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dga",
      name = "a",
      descriptor = "(Lsf;B)V"
   )
   private final void method1630(class549 arg0, byte arg1) {
      int var3 = client.field4530;

      try {
         ++field2729;
         long var4 = arg0.method1888((byte)-78);
         class300 var6 = (class300)this.field2731.method5681(var4, -1);
         byte var10000;
         if (var3 != 0) {
            var10000 = var6.field4284.method1889(arg0, -14313);
         } else if (var6 == null) {
            var10000 = arg1;
            if (var3 == 0) {
               if (arg1 != 115) {
                  this.method1633(77);
                  return;
               }

               return;
            }
         } else {
            var10000 = var6.field4284.method1889(arg0, -14313);
         }

         do {
            while(true) {
               if (var10000 != 0) {
                  this.method1635(0, var6);
                  if (var3 == 0) {
                     var10000 = arg1;
                     break;
                  }

                  var6 = (class300)this.field2731.method5673(-90);
               } else {
                  var6 = (class300)this.field2731.method5673(-90);
               }

               if (var6 == null) {
                  var10000 = arg1;
                  if (var3 == 0) {
                     if (arg1 != 115) {
                        this.method1633(77);
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = var6.field4284.method1889(arg0, -14313);
               }
            }
         } while(var3 != 0);

         if (arg1 != 115) {
            this.method1633(77);
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field2738[15] + (arg0 != null ? field2738[1] : field2738[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dga",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1631(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dga",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method1632(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         if (class553.field8205 != null) {
            class300 var4 = (class300)this.field2736.method5158(0);
            if (var3 != 0 || var4 != null) {
               do {
                  label40: {
                     if (!var4.method1374(-25864)) {
                        if ((long)arg0 >= ++var4.field882) {
                           break label40;
                        }

                        class300 var5 = class553.field8205.method5414((byte)-89, var4);
                        this.field2731.method5682(var4.field5280, var5, (byte)7);
                        class729.method5312((byte)-122, var5, var4);
                        var4.method2720(arg1 ^ 8739);
                        var4.method699(12);
                        if (var3 == 0) {
                           break label40;
                        }
                     }

                     if (var4.method1376(false) == null) {
                        var4.method2720(arg1 + -8739);
                        var4.method699(12);
                        this.field2725 += var4.field4285;
                     }
                  }

                  var4 = (class300)this.field2736.method5163((byte)103);
               } while(var4 != null);
            }
         }

         ++field2733;
         if (arg1 != 8739) {
            method1636(6, 122, -3);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field2738[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dga",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method1633(int arg0) {
      try {
         ++field2735;
         this.field2736.method5162((byte)55);
         if (arg0 != 30490) {
            field2734 = 94;
         }

         this.field2731.method5680(true);
         this.field2725 = this.field2720;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2738[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dga",
      name = "a",
      descriptor = "(Lsf;Z)Ljava/lang/Object;"
   )
   public final Object method1634(class549 arg0, boolean arg1) {
      int var3 = client.field4530;

      try {
         ++field2727;
         long var4 = arg0.method1888((byte)-71);
         if (arg1) {
            return null;
         } else {
            class300 var6;
            Object var7;
            label69: {
               var6 = (class300)this.field2731.method5681(var4, -1);
               if (var3 != 0) {
                  if (var6.field4284.method1889(arg0, -14313)) {
                     var7 = var6.method1376(false);
                     if (var7 != null) {
                        break label69;
                     }

                     var6.method2720(0);
                     var6.method699(12);
                     this.field2725 += var6.field4285;
                     if (var3 != 0) {
                        break label69;
                     }
                  }

                  var6 = (class300)this.field2731.method5673(79);
               }

               label68:
               while(true) {
                  while(var6 != null) {
                     if (var6.field4284.method1889(arg0, -14313)) {
                        var7 = var6.method1376(false);
                        if (var7 != null) {
                           break label68;
                        }

                        var6.method2720(0);
                        var6.method699(12);
                        this.field2725 += var6.field4285;
                        if (var3 != 0) {
                           break label68;
                        }
                     }

                     var6 = (class300)this.field2731.method5673(79);
                  }

                  if (var3 == 0) {
                     return null;
                  }

                  var6 = (class300)this.field2731.method5673(79);
               }
            }

            if (var6.method1374(-25864)) {
               class171 var8 = new class171(arg0, var7, var6.field4285);
               this.field2731.method5682(var6.field5280, var8, (byte)7);
               this.field2736.method5164(var8, (byte)-105);
               var8.field882 = 0L;
               var6.method2720(0);
               var6.method699(12);
               if (var3 == 0) {
                  return var7;
               }
            }

            this.field2736.method5164(var6, (byte)-105);
            var6.field882 = 0L;
            return var7;
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field2738[7] + (arg0 != null ? field2738[1] : field2738[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dga",
      name = "a",
      descriptor = "(ILuu;)V"
   )
   private final void method1635(int arg0, class300 arg1) {
      try {
         if (arg1 != null) {
            arg1.method2720(arg0);
            arg1.method699(12);
            this.field2725 += arg1.field4285;
         }

         ++field2730;
         if (arg0 != 0) {
            this.method1628(108);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2738[11] + arg0 + ',' + (arg1 != null ? field2738[1] : field2738[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dga",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1636(int arg0, int arg1, int arg2) {
      try {
         ++field2721;
         if (arg1 != 0) {
            return true;
         } else {
            return (arg2 & 540800) != 0;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2738[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dga",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class216(int arg0) {
      int var2 = client.field4530;
      super();
      this.field2736 = new class712();

      try {
         this.field2725 = arg0;
         this.field2720 = arg0;
         int var3 = 1;
         if (var2 != 0) {
            var3 += var3;
         }

         while(~(var3 + var3) > ~arg0) {
            var3 += var3;
         }

         this.field2731 = new class791(var3);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field2738[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dga",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method1637(int arg0) {
      try {
         ++field2722;
         if (arg0 != 19617) {
            method1636(-99, -10, -32);
         }

         return this.field2720;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2738[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1638(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1639(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 30;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 37;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
