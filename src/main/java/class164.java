import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class164 {
   @OriginalMember(
      owner = "client!fm",
      name = "f",
      descriptor = "I"
   )
   public int field2490;
   @OriginalMember(
      owner = "client!fm",
      name = "d",
      descriptor = "I"
   )
   private int field2485;
   @OriginalMember(
      owner = "client!fm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2491 = new String[]{method1547(method1546("H(i4")), method1547(method1546("u5d<\u0018T}i1\u0013M4k?]@<l4\u0018Bg")), method1547(method1546("]s+v\u0000")), method1547(method1546("@0+\u001fU")), method1547(method1546("@0+\u001bU")), method1547(method1546("@0+\u001eU")), method1547(method1546("@0+d\u0014H4qfU")), method1547(method1546("@0+\u001dU")), method1547(method1546("@0+\u0019U")), method1547(method1546("@0+\u001cU")), method1547(method1546("@0+,\u0012u)w1\u0013Au"))};
   @OriginalMember(
      owner = "client!fm",
      name = "h",
      descriptor = "Z"
   )
   public static boolean field2484 = false;
   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "I"
   )
   public static int field2480;
   @OriginalMember(
      owner = "client!fm",
      name = "i",
      descriptor = "I"
   )
   public static int field2481;
   @OriginalMember(
      owner = "client!fm",
      name = "j",
      descriptor = "I"
   )
   public static int field2482;
   @OriginalMember(
      owner = "client!fm",
      name = "b",
      descriptor = "I"
   )
   public static int field2486;
   @OriginalMember(
      owner = "client!fm",
      name = "c",
      descriptor = "I"
   )
   public static int field2487;
   @OriginalMember(
      owner = "client!fm",
      name = "k",
      descriptor = "I"
   )
   public static int field2489;
   @OriginalMember(
      owner = "client!fm",
      name = "e",
      descriptor = "Lwja;"
   )
   public static class97 field2488;
   @OriginalMember(
      owner = "client!fm",
      name = "g",
      descriptor = "[Ljh;"
   )
   public static class697[] field2483;

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method1539(int arg0, int arg1, int arg2) {
      try {
         ++field2482;
         class111 var3 = class796.method5734(7, (long)arg2, (byte)-111);
         if (arg1 > -107) {
            method1545(true, -126, 16);
         }

         var3.method1087(0);
         var3.field1740 = arg0;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2491[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(IIIILft;)V"
   )
   public static final void method1540(int arg0, int arg1, int arg2, int arg3, class188 arg4) {
      class312 var5 = class366.method2886(arg0, arg1, arg2);
      if (var5 != null) {
         arg4.field6832 = (arg1 << class313.field4707) + class744.field10587;
         arg4.field6829 = arg3;
         arg4.field6833 = (arg2 << class313.field4707) + class744.field10587;
         var5.field4680 = arg4;
         int var6 = class634.field8989 == class225.field3197 ? 1 : 0;
         if (arg4.method725(-6664)) {
            if (arg4.method723(-108)) {
               arg4.field6823 = class705.field10147[var6];
               class705.field10147[var6] = arg4;
               return;
            }

            arg4.field6823 = class615.field8739[var6];
            class615.field8739[var6] = arg4;
            class248.field3804 = true;
            return;
         }

         arg4.field6823 = class399.field5912[var6];
         class399.field5912[var6] = arg4;
      }

   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "([Ljga;ZIIIZ)V"
   )
   public static final void method1541(class91[] arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5) {
      boolean var6 = client.field10022;

      try {
         int var7 = 0;
         if (!var6 && var7 >= arg0.length) {
            ++field2489;
            if (!arg1) {
               method1542((byte)-124);
            }
         } else {
            do {
               class91 var8 = arg0[var7];
               if (var8 != null && var8.field1407 == arg3) {
                  class439.method3418(arg4, arg2, arg5, -6, var8);
                  class508.method3831(arg4, var8, (byte)61, arg2);
                  if (-var8.field1513 + var8.field1457 < var8.field1419) {
                     var8.field1419 = -var8.field1513 + var8.field1457;
                  }

                  if (~(-var8.field1452 + var8.field1393) > ~var8.field1371) {
                     var8.field1371 = var8.field1393 - var8.field1452;
                  }

                  if (var8.field1419 < 0) {
                     var8.field1419 = 0;
                  }

                  if (~var8.field1371 > -1) {
                     var8.field1371 = 0;
                  }

                  if (var8.field1403 == 0) {
                     class220.method1906(-9278, var8, arg5);
                  }
               }

               ++var7;
            } while(var7 < arg0.length);

            ++field2489;
            if (!arg1) {
               method1542((byte)-124);
            }
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field2491[8] + (arg0 != null ? field2491[2] : field2491[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field2487;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2491[10] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1542(byte arg0) {
      try {
         if (arg0 == -4) {
            field2488 = null;
            field2483 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2491[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method1543(int arg0) {
      try {
         if (arg0 != 6) {
            method1545(false, 113, -126);
         }

         ++field2481;
         return this.field2485;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2491[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "([Lqo;ILqs;)Lska;"
   )
   public static final class225 method1544(class170[] arg0, int arg1, class771 arg2) {
      boolean var3 = client.field10022;

      try {
         ++field2486;
         int var4 = 0;
         if (var3) {
            if (arg0[var4] == null || ~arg0[var4].field2553 >= -1L) {
               return null;
            }

            ++var4;
         }

         while(true) {
            while(~arg0.length < ~var4) {
               if (arg0[var4] == null || ~arg0[var4].field2553 >= -1L) {
                  return null;
               }

               ++var4;
            }

            if (!var3) {
               if (arg1 != -7567) {
                  field2488 = null;
               }

               long var5 = OpenGL.glCreateProgramObjectARB();
               int var7 = 0;
               if (var3) {
                  OpenGL.glAttachObjectARB(var5, arg0[var7].field2553);
                  ++var7;
               }

               while(true) {
                  while(~var7 > ~arg0.length) {
                     OpenGL.glAttachObjectARB(var5, arg0[var7].field2553);
                     ++var7;
                  }

                  OpenGL.glLinkProgramARB(var5);
                  OpenGL.glGetObjectParameterivARB(var5, 35714, class458.field6685, 0);
                  if (!var3) {
                     if (~class458.field6685[0] == -1) {
                        if (~class458.field6685[0] == -1) {
                           System.out.println(field2491[1]);
                        }

                        OpenGL.glGetObjectParameterivARB(var5, 35716, class458.field6685, 1);
                        if (class458.field6685[1] > 1) {
                           byte[] var8 = new byte[class458.field6685[1]];
                           OpenGL.glGetInfoLogARB(var5, class458.field6685[1], class458.field6685, 0, var8, 0);
                           System.out.println(new String(var8));
                        }

                        if (class458.field6685[0] == 0) {
                           int var9 = 0;
                           if (var3) {
                              OpenGL.glDetachObjectARB(var5, arg0[var9].field2553);
                              ++var9;
                           }

                           while(true) {
                              while(var9 < arg0.length) {
                                 OpenGL.glDetachObjectARB(var5, arg0[var9].field2553);
                                 ++var9;
                              }

                              OpenGL.glDeleteObjectARB(var5);
                              if (!var3) {
                                 return null;
                              }

                              ++var9;
                           }
                        }
                     }

                     return new class225(arg2, var5, arg0);
                  }

                  ++var7;
               }
            }

            if (arg1 >= 0) {
               return null;
            }

            ++var4;
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field2491[3] + (arg0 != null ? field2491[2] : field2491[0]) + ',' + arg1 + ',' + (arg2 != null ? field2491[2] : field2491[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class164(int arg0, int arg1) {
      try {
         this.field2490 = arg1;
         this.field2485 = arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2491[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(ZII)Z"
   )
   public static final boolean method1545(boolean arg0, int arg1, int arg2) {
      try {
         if (arg0) {
            return true;
         } else {
            ++field2480;
            return ~(2048 & arg1) != -1 | class382.method2979(arg2, arg1, 32768) || class388.method3023(arg2, arg1, (byte)63);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2491[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1546(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1547(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 38;
            break;
         case 1:
            var10005 = 93;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
