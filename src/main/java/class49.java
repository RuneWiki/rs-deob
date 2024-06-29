import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public class class49 {
   @OriginalMember(
      owner = "client!hia",
      name = "p",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field679 = new String[0];
   @OriginalMember(
      owner = "client!hia",
      name = "j",
      descriptor = "Z"
   )
   private boolean field680 = false;
   @OriginalMember(
      owner = "client!hia",
      name = "b",
      descriptor = "I"
   )
   private int field692 = -1;
   @OriginalMember(
      owner = "client!hia",
      name = "a",
      descriptor = "I"
   )
   private int field691;
   @OriginalMember(
      owner = "client!hia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field694 = new String[]{method374(method373("\t$[ERI")), method374(method373("\t$[E]I")), method374(method373("\t$[EYI")), method374(method373("\t$[En\u000e\u001eN\u0019s\u000f*\u0012")), method374(method373("Mm")), method374(method373("\t$[E\\I")), method374(method373("\u001ac\u0014Eg")), method374(method373("\t$[E^I")), method374(method373("\u000f8V\u0007")), method374(method373("\t$[E&\b#S\u001f$I")), method374(method373("\t$[EPI")), method374(method373("\t$[E[I")), method374(method373("MmH\u001et\u000f$T\f A")), method374(method373("1,H\u001fs\u0002!_Ki\u0018>N\u000ewA.U\u001et\u0015w\u001a")), method374(method373("Omn\u0002w\u0004mN\nq\u0004#\u0000K")), method374(method373("\f>")), method374(method373("$ S\u001fn\u0004?IQ:")), method374(method373("A\u001d[\u0019n\b.V\u000ei[m")), method374(method373("\t$[E_I")), method374(method373("\t$[ESI"))};
   @OriginalMember(
      owner = "client!hia",
      name = "n",
      descriptor = "Laka;"
   )
   public static class418 field683 = new class418(96, 9);
   @OriginalMember(
      owner = "client!hia",
      name = "f",
      descriptor = "[[F"
   )
   public static float[][] field686 = new float[][]{{-0.333333F, -0.333333F, -0.333333F}, {0.333333F, -0.333333F, -0.333333F}, {-0.333333F, 0.333333F, -0.333333F}, {0.333333F, 0.333333F, -0.333333F}, {-0.333333F, -0.333333F, 0.333333F}, {0.333333F, -0.333333F, 0.333333F}, {-0.333333F, 0.333333F, 0.333333F}, {0.333333F, 0.333333F, 0.333333F}};
   @OriginalMember(
      owner = "client!hia",
      name = "c",
      descriptor = "I"
   )
   public static int field678;
   @OriginalMember(
      owner = "client!hia",
      name = "g",
      descriptor = "I"
   )
   public static int field681;
   @OriginalMember(
      owner = "client!hia",
      name = "h",
      descriptor = "I"
   )
   public static int field682;
   @OriginalMember(
      owner = "client!hia",
      name = "e",
      descriptor = "I"
   )
   public static int field684;
   @OriginalMember(
      owner = "client!hia",
      name = "i",
      descriptor = "I"
   )
   public static int field685;
   @OriginalMember(
      owner = "client!hia",
      name = "l",
      descriptor = "I"
   )
   public static int field687;
   @OriginalMember(
      owner = "client!hia",
      name = "k",
      descriptor = "I"
   )
   public static int field689;
   @OriginalMember(
      owner = "client!hia",
      name = "d",
      descriptor = "I"
   )
   public static int field690;
   @OriginalMember(
      owner = "client!hia",
      name = "o",
      descriptor = "I"
   )
   public static int field693;
   @OriginalMember(
      owner = "client!hia",
      name = "m",
      descriptor = "Lrd;"
   )
   public static class512 field688;

   @OriginalMember(
      owner = "client!hia",
      name = "b",
      descriptor = "(I)I"
   )
   public static final int method363(int arg0) {
      int var1 = -1;

      for(int var2 = 0; var2 < class385.field5335 - 1; ++var2) {
         if (arg0 < class785.field11472[var2] + class278.field3549[var2]) {
            var1 = var2;
            break;
         }
      }

      if (var1 == -1) {
         var1 = class385.field5335 - 1;
      }

      return var1;
   }

   @OriginalMember(
      owner = "client!hia",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      boolean var1 = client.field1481;

      try {
         ++field689;
         StringBuffer var2 = new StringBuffer();
         var2.append("[");
         int var3 = 0;
         if (var1) {
            if (~var3 != -1) {
               var2.append(field694[4]);
            }

            var2.append(this.field679[var3]);
            ++var3;
         }

         while(true) {
            while(var3 < this.field692) {
               if (~var3 != -1) {
                  var2.append(field694[4]);
               }

               var2.append(this.field679[var3]);
               ++var3;
            }

            var2.append("]");
            if (!var1) {
               return var2.toString();
            }

            ++var3;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field694[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!hia",
      name = "a",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public final void method364(String arg0, int arg1) {
      try {
         ++field693;
         this.method366(-1, this.field692 - arg1, arg0);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field694[11] + (arg0 != null ? field694[6] : field694[8]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hia",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method365(int arg0) {
      try {
         field686 = null;
         field683 = null;
         field688 = null;
         if (arg0 >= -19) {
            method363(66);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field694[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hia",
      name = "a",
      descriptor = "(IILjava/lang/String;)V"
   )
   private final void method366(int arg0, int arg1, String arg2) {
      try {
         if (this.field692 < arg1) {
            this.field692 = arg1;
         }

         ++field682;
         if (arg1 >= this.field679.length) {
            this.method369((byte)-100, arg1);
         }

         if (arg0 != -1) {
            method365(-35);
         }

         this.field679[arg1] = arg2;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field694[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field694[6] : field694[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hia",
      name = "b",
      descriptor = "(BI)I"
   )
   private final int method367(byte arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field681;
         int var4 = -22 % ((-9 - arg0) / 59);
         int var5 = this.field679.length;
         int var10000;
         if (var3) {
            var10000 = this.field680;
         } else if (var5 > arg1) {
            var10000 = var5;
            if (!var3) {
               return var5;
            }
         } else {
            var10000 = this.field680;
         }

         while(true) {
            if (var10000 != 0) {
               if (~var5 == -1) {
                  var5 = 1;
                  if (var3) {
                     var5 = this.field691 * var5;
                     if (var3) {
                        var5 += this.field691;
                     }
                  }
               } else {
                  var5 = this.field691 * var5;
                  if (var3) {
                     var5 += this.field691;
                  }
               }
            } else {
               var5 += this.field691;
            }

            if (var5 > arg1) {
               var10000 = var5;
               if (!var3) {
                  return var5;
               }
            } else {
               var10000 = this.field680;
            }
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field694[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hia",
      name = "a",
      descriptor = "(I)[Ljava/lang/String;"
   )
   public final String[] method368(int arg0) {
      try {
         ++field690;
         if (arg0 >= -62) {
            method371(-79, -120L, (class479)null);
         }

         String[] var2 = new String[this.field692 - -1];
         class349.method2758(this.field679, 0, var2, 0, this.field692 + 1);
         return var2;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field694[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hia",
      name = "a",
      descriptor = "(BI)V"
   )
   private final void method369(byte arg0, int arg1) {
      try {
         ++field685;
         String[] var3 = new String[this.method367((byte)-92, arg1)];
         class349.method2758(this.field679, 0, var3, 0, this.field679.length);
         if (arg0 <= -89) {
            this.field679 = var3;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field694[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hia",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public static final boolean method370(int arg0, int arg1, byte arg2) {
      try {
         ++field687;
         if (arg2 > -117) {
            method371(19, 26L, (class479)null);
         }

         return class392.method3098(arg1, arg0, (byte)127) & (class615.method4536(arg1, arg0, (byte)117) | (8192 & arg1) != 0 | class669.method4882(57, arg0, arg1));
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field694[19] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hia",
      name = "a",
      descriptor = "(IJLha;)V"
   )
   public static final void method371(int arg0, long arg1, class479 arg2) {
      boolean var4 = client.field1481;

      try {
         ++field678;
         if (arg0 >= 73) {
            class543.field7922 = class314.field4355;
            class9.field167 = 0;
            class248.field3142 = 0;
            class314.field4355 = 0;
            long var5 = class163.method1353(-127);
            class619 var7 = (class619)class363.field5037.method4639(-69);
            if (var4) {
               if (var7.method4556(arg2, arg1)) {
                  ++class248.field3142;
               }

               var7 = (class619)class363.field5037.method4636((byte)88);
            }

            while(true) {
               boolean var10000;
               if (var7 == null) {
                  var10000 = class397.field5475;
                  if (!var4) {
                     if (var10000 && arg1 % 100L == 0L) {
                        System.out.println(field694[13] + class363.field5037.method4632((byte)-98) + field694[12] + class248.field3142);
                        System.out.println(field694[16] + class9.field167 + field694[17] + class314.field4355 + field694[14] + (-var5 + class163.method1353(-124)) + field694[15]);
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = var7.method4556(arg2, arg1);
               }

               if (var10000) {
                  ++class248.field3142;
               }

               var7 = (class619)class363.field5037.method4636((byte)88);
            }
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field694[18] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field694[6] : field694[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hia",
      name = "a",
      descriptor = "(Loca;I)V"
   )
   public static final void method372(class642 arg0, int arg1) {
      try {
         if (arg1 != 0) {
            method372((class642)null, 67);
         }

         ++field684;
         if (~class737.field10800 == ~arg0.field9566) {
            class485.field6750[arg0.field9497] = true;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field694[7] + (arg0 != null ? field694[6] : field694[8]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hia",
      name = "<init>",
      descriptor = "(IZ)V"
   )
   public class49(int arg0, boolean arg1) {
      try {
         this.field680 = arg1;
         this.field691 = arg0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field694[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method373(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method374(char[] arg0) {
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
            var10005 = 77;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 107;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
