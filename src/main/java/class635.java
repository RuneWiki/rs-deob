import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class635 {
   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "Loi;"
   )
   private class80 field9284 = new class80(64);
   @OriginalMember(
      owner = "client!lj",
      name = "d",
      descriptor = "Loi;"
   )
   public class80 field9285 = new class80(64);
   @OriginalMember(
      owner = "client!lj",
      name = "i",
      descriptor = "Lkf;"
   )
   private class266 field9283;
   @OriginalMember(
      owner = "client!lj",
      name = "l",
      descriptor = "Lkf;"
   )
   public class266 field9276;
   @OriginalMember(
      owner = "client!lj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9291 = new String[]{method4599(method4598("U\n- @")), method4599(method4598("T\u0014")), method4599(method4598("U\n-)@")), method4599(method4598("U\n-$@")), method4599(method4598("U\n-'@")), method4599(method4598("U\n-#@")), method4599(method4598("P\u00062")), method4599(method4598("U\n-]\u0001W\tw_@")), method4599(method4598("BN-O\u0015")), method4599(method4598("W\u0015o\r")), method4599(method4598("U\n-\"@")), method4599(method4598("U\n-%@")), method4599(method4598("U\n-&@"))};
   @OriginalMember(
      owner = "client!lj",
      name = "m",
      descriptor = "Luda;"
   )
   public static class478 field9281 = new class478();
   @OriginalMember(
      owner = "client!lj",
      name = "e",
      descriptor = "Lwu;"
   )
   public static class395 field9286 = new class395(15, 0, 1, 0);
   @OriginalMember(
      owner = "client!lj",
      name = "k",
      descriptor = "Leg;"
   )
   public static class118 field9287 = new class118(8, 6);
   @OriginalMember(
      owner = "client!lj",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field9289 = new int[]{7, 8, 9, 10, 11, 12, 13, 15};
   @OriginalMember(
      owner = "client!lj",
      name = "b",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field9290 = new String[100];
   @OriginalMember(
      owner = "client!lj",
      name = "h",
      descriptor = "I"
   )
   public static int field9274;
   @OriginalMember(
      owner = "client!lj",
      name = "c",
      descriptor = "I"
   )
   public static int field9275;
   @OriginalMember(
      owner = "client!lj",
      name = "p",
      descriptor = "I"
   )
   public static int field9277;
   @OriginalMember(
      owner = "client!lj",
      name = "f",
      descriptor = "I"
   )
   public static int field9278;
   @OriginalMember(
      owner = "client!lj",
      name = "n",
      descriptor = "I"
   )
   public static int field9279;
   @OriginalMember(
      owner = "client!lj",
      name = "o",
      descriptor = "I"
   )
   public static int field9280;
   @OriginalMember(
      owner = "client!lj",
      name = "g",
      descriptor = "I"
   )
   public static int field9282;
   @OriginalMember(
      owner = "client!lj",
      name = "q",
      descriptor = "Lkf;"
   )
   public static class266 field9288;

   @OriginalMember(
      owner = "client!lj",
      name = "c",
      descriptor = "(I)V",
      line = 8
   )
   public static void method4590(int arg0) {
      try {
         field9287 = null;
         if (arg0 >= -78) {
            field9290 = null;
         }

         field9281 = null;
         field9288 = null;
         field9289 = null;
         field9290 = null;
         field9286 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9291[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "(BI)V",
      line = 25
   )
   public final void method4591(byte arg0, int arg1) {
      try {
         ++field9274;
         class80 var3 = this.field9284;
         synchronized(this.field9284) {
            this.field9284.method726(arg1, 25324);
         }

         class80 var4 = this.field9285;
         synchronized(this.field9285) {
            if (arg0 == -9) {
               this.field9285.method726(arg1, 25324);
            }
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field9291[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "(III)V",
      line = 44
   )
   public final void method4592(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != 100) {
            this.method4594(124);
         }

         this.field9284 = new class80(arg0);
         ++field9282;
         this.field9285 = new class80(arg1);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field9291[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "(I)Lwga;",
      line = 56
   )
   public static final class781 method4593(int arg0) {
      try {
         ++field9275;
         if (arg0 != 0) {
            return null;
         } else {
            try {
               return (class781)Class.forName(field9291[1]).newInstance();
            } catch (Throwable var2) {
               return null;
            }
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9291[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "b",
      descriptor = "(I)V",
      line = 74
   )
   public final void method4594(int arg0) {
      try {
         if (arg0 == 10) {
            class80 var2 = this.field9284;
            synchronized(this.field9284) {
               this.field9284.method715(true);
            }

            ++field9280;
            class80 var3 = this.field9285;
            synchronized(this.field9285) {
               this.field9285.method715(true);
            }
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field9291[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "(Z)V",
      line = 92
   )
   public final void method4595(boolean arg0) {
      try {
         class80 var2 = this.field9284;
         synchronized(this.field9284) {
            if (arg0) {
               field9287 = null;
            }

            this.field9284.method731(0);
         }

         ++field9278;
         class80 var3 = this.field9285;
         synchronized(this.field9285) {
            this.field9285.method731(0);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field9291[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "(II)Z",
      line = 109
   )
   public static final boolean method4596(int arg0, int arg1) {
      boolean var2 = client.field4360;

      try {
         ++field9277;
         if (class603.field8873[arg0]) {
            return true;
         } else if (!class361.field4924.method2059((byte)-31, arg0)) {
            return false;
         } else {
            if (arg1 != 28505) {
               method4590(74);
            }

            int var3 = class361.field4924.method2060(arg1 + -28503, arg0);
            if (~var3 == -1) {
               class603.field8873[arg0] = true;
               return true;
            } else {
               if (class547.field7851[arg0] == null) {
                  class547.field7851[arg0] = new class678[var3];
               }

               int var4 = 0;
               byte[] var5;
               class678 var6;
               if (var2) {
                  if (class547.field7851[arg0][var4] == null) {
                     var5 = class361.field4924.method2037(false, var4, arg0);
                     if (var5 != null) {
                        var6 = class547.field7851[arg0][var4] = new class678();
                        var6.field9854 = (arg0 << 16) - -var4;
                        if (~var5[0] != 0) {
                           throw new IllegalStateException(field9291[6]);
                        }

                        var6.method4948(new class147(var5), 1);
                     }
                  }

                  ++var4;
               }

               while(true) {
                  while(~var4 > ~var3) {
                     if (class547.field7851[arg0][var4] == null) {
                        var5 = class361.field4924.method2037(false, var4, arg0);
                        if (var5 != null) {
                           var6 = class547.field7851[arg0][var4] = new class678();
                           var6.field9854 = (arg0 << 16) - -var4;
                           if (~var5[0] != 0) {
                              throw new IllegalStateException(field9291[6]);
                           }

                           var6.method4948(new class147(var5), 1);
                        }
                     }

                     ++var4;
                  }

                  class603.field8873[arg0] = true;
                  if (!var2) {
                     return true;
                  }

                  ++var4;
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field9291[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "<init>",
      descriptor = "(Lno;ILkf;Lkf;)V",
      line = 219
   )
   public class635(class732 arg0, int arg1, class266 arg2, class266 arg3) {
      try {
         this.field9283 = arg2;
         this.field9276 = arg3;
         this.field9283.method2060(2, 34);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field9291[7] + (arg0 != null ? field9291[8] : field9291[9]) + ',' + arg1 + ',' + (arg2 != null ? field9291[8] : field9291[9]) + ',' + (arg3 != null ? field9291[8] : field9291[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "b",
      descriptor = "(II)Lrs;",
      line = 175
   )
   public final class681 method4597(int arg0, int arg1) {
      try {
         ++field9279;
         class80 var3 = this.field9284;
         class681 var4;
         synchronized(this.field9284) {
            var4 = (class681)this.field9284.method725(0, (long)arg1);
         }

         if (var4 != null) {
            return var4;
         } else {
            if (arg0 != 31352) {
               field9288 = null;
            }

            class266 var5 = this.field9283;
            byte[] var6;
            synchronized(this.field9283) {
               var6 = this.field9283.method2037(false, arg1, 34);
            }

            class681 var7 = new class681();
            var7.field10028 = this;
            if (var6 != null) {
               var7.method4969(0, new class147(var6));
            }

            class80 var8 = this.field9284;
            synchronized(this.field9284) {
               this.field9284.method723(0, (long)arg1, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field9291[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4598(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4599(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 57;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
