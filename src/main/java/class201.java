import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class201 extends class30 implements class77 {
   @OriginalMember(
      owner = "client!m",
      name = "p",
      descriptor = "I"
   )
   private int field3006;
   @OriginalMember(
      owner = "client!m",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3019 = new String[]{method1727(method1726("&\fI\tw\"VKH")), method1727(method1726("%W\u0019\f")), method1727(method1726("0\f[Nd")), method1727(method1726("&\f1H")), method1727(method1726("&\f0H")), method1727(method1726("&\f6H")), method1727(method1726("&\f4H")), method1727(method1726("&\f2H")), method1727(method1726("&\f7H")), method1727(method1726("&\f3H")), method1727(method1726("&\f=H"))};
   @OriginalMember(
      owner = "client!m",
      name = "y",
      descriptor = "Lqia;"
   )
   public static class23 field3007 = new class23(128);
   @OriginalMember(
      owner = "client!m",
      name = "s",
      descriptor = "Luw;"
   )
   public static class435 field3015 = new class435(9, 8);
   @OriginalMember(
      owner = "client!m",
      name = "t",
      descriptor = "Z"
   )
   public static boolean field3016 = false;
   @OriginalMember(
      owner = "client!m",
      name = "r",
      descriptor = "Z"
   )
   public static boolean field3018 = true;
   @OriginalMember(
      owner = "client!m",
      name = "v",
      descriptor = "I"
   )
   public static int field3008;
   @OriginalMember(
      owner = "client!m",
      name = "w",
      descriptor = "I"
   )
   public static int field3009;
   @OriginalMember(
      owner = "client!m",
      name = "u",
      descriptor = "I"
   )
   public static int field3010;
   @OriginalMember(
      owner = "client!m",
      name = "x",
      descriptor = "I"
   )
   public static int field3011;
   @OriginalMember(
      owner = "client!m",
      name = "m",
      descriptor = "I"
   )
   public static int field3012;
   @OriginalMember(
      owner = "client!m",
      name = "q",
      descriptor = "I"
   )
   public static int field3013;
   @OriginalMember(
      owner = "client!m",
      name = "n",
      descriptor = "I"
   )
   public static int field3014;
   @OriginalMember(
      owner = "client!m",
      name = "o",
      descriptor = "Lod;"
   )
   public static class530 field3017;

   @OriginalMember(
      owner = "client!m",
      name = "a",
      descriptor = "(Z)J"
   )
   public final long method796(boolean arg0) {
      try {
         ++field3010;
         if (arg0) {
            this.field3006 = -43;
         }

         return 0L;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3019[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method225(byte arg0) {
      try {
         super.field461.method313(this, (byte)48);
         ++field3011;
         if (arg0 != 45) {
            field3016 = true;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3019[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "<init>",
      descriptor = "(Lrk;ILjaclib/memory/Buffer;IZ)V"
   )
   public class201(class35 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
      super(arg0, 34962, arg2, arg3, arg4);

      try {
         this.field3006 = arg1;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field3019[0] + (arg0 != null ? field3019[2] : field3019[1]) + ',' + arg1 + ',' + (arg2 != null ? field3019[2] : field3019[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "<init>",
      descriptor = "(Lrk;I[BIZ)V"
   )
   public class201(class35 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
      super(arg0, 34962, arg2, arg3, arg4);

      try {
         this.field3006 = arg1;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field3019[0] + (arg0 != null ? field3019[2] : field3019[1]) + ',' + arg1 + ',' + (arg2 != null ? field3019[2] : field3019[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1723(int arg0) {
      try {
         field3017 = null;
         if (arg0 <= 19) {
            field3016 = false;
         }

         field3015 = null;
         field3007 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3019[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "a",
      descriptor = "([[[Luo;I)V"
   )
   public static final void method1724(class600[][][] arg0, int arg1) {
      boolean var2 = client.field4564;

      try {
         int var3 = 0;
         if (!var2 && ~arg0.length >= ~var3) {
            ++field3008;
            if (arg1 > -100) {
               method1725(-96, 2);
            }
         } else {
            do {
               class600[][] var4 = arg0[var3];
               int var5 = 0;
               if (var2 || ~var4.length < ~var5) {
                  do {
                     int var6 = 0;
                     if (var2 || var4[var5].length > var6) {
                        do {
                           class600 var7 = var4[var5][var6];
                           if (var7 == null) {
                              ++var6;
                           } else {
                              if (var7.field8654 instanceof class268) {
                                 ((class268)var7.field8654).method597(true);
                              }

                              if (var7.field8658 instanceof class268) {
                                 ((class268)var7.field8658).method597(true);
                                 if (var7.field8660 instanceof class268) {
                                    ((class268)var7.field8660).method597(true);
                                 }
                              } else if (var7.field8660 instanceof class268) {
                                 ((class268)var7.field8660).method597(true);
                              }

                              if (var7.field8659 instanceof class268) {
                                 ((class268)var7.field8659).method597(true);
                                 if (var7.field8661 instanceof class268) {
                                    ((class268)var7.field8661).method597(true);
                                 }
                              } else if (var7.field8661 instanceof class268) {
                                 ((class268)var7.field8661).method597(true);
                              }

                              class533 var8 = var7.field8653;
                              class144 var9;
                              if (var2) {
                                 var9 = var8.field7766;
                                 if (var9 instanceof class268) {
                                    ((class268)var9).method597(true);
                                 }

                                 var8 = var8.field7763;
                              }

                              while(var8 != null) {
                                 var9 = var8.field7766;
                                 if (var9 instanceof class268) {
                                    ((class268)var9).method597(true);
                                 }

                                 var8 = var8.field7763;
                              }

                              ++var6;
                           }
                        } while(var4[var5].length > var6);
                     }

                     ++var5;
                  } while(~var4.length < ~var5);
               }

               ++var3;
            } while(~arg0.length < ~var3);

            ++field3008;
            if (arg1 > -100) {
               method1725(-96, 2);
            }
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field3019[9] + (arg0 != null ? field3019[2] : field3019[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method795(int arg0) {
      try {
         if (arg0 != 6854) {
            field3015 = null;
         }

         ++field3009;
         return super.field468;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3019[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method1725(int arg0, int arg1) {
      try {
         if (arg1 != 8) {
            return true;
         } else {
            ++field3012;
            return arg0 == 2 || arg0 == 3;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3019[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "a",
      descriptor = "([BIII)V"
   )
   public final void method797(byte[] arg0, int arg1, int arg2, int arg3) {
      try {
         this.method219(arg3 + 20860, arg2, arg0);
         ++field3013;
         this.field3006 = arg1;
         if (arg3 != 14180) {
            field3015 = null;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field3019[5] + (arg0 != null ? field3019[2] : field3019[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method794(byte arg0) {
      try {
         ++field3014;
         return arg0 <= 57 ? 18 : this.field3006;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3019[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1726(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!m",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1727(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 34;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
