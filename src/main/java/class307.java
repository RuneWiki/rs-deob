import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class307 {
   @OriginalMember(
      owner = "client!sb",
      name = "u",
      descriptor = "Z"
   )
   private boolean field4075 = false;
   @OriginalMember(
      owner = "client!sb",
      name = "n",
      descriptor = "I"
   )
   public int field4074 = 0;
   @OriginalMember(
      owner = "client!sb",
      name = "b",
      descriptor = "I"
   )
   public int field4081 = 0;
   @OriginalMember(
      owner = "client!sb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4092 = new String[]{method2313(method2312("t\u0014 LI")), method2313(method2312("t\u0014 OI")), method2313(method2312("t\u0014 KI")), method2313(method2312("|X #\u001c")), method2313(method2312("t\u0014 II")), method2313(method2312("i\u0003ba")), method2313(method2312("t\u0014 NI")), method2313(method2312("t\u0014 EI")), method2313(method2312("t\u0014 HI")), method2313(method2312("t\u0014 JI"))};
   @OriginalMember(
      owner = "client!sb",
      name = "w",
      descriptor = "Ljava/util/Hashtable;"
   )
   public static Hashtable field4083 = new Hashtable();
   @OriginalMember(
      owner = "client!sb",
      name = "f",
      descriptor = "I"
   )
   public static int field4068;
   @OriginalMember(
      owner = "client!sb",
      name = "q",
      descriptor = "I"
   )
   public static int field4069;
   @OriginalMember(
      owner = "client!sb",
      name = "v",
      descriptor = "I"
   )
   public int field4070;
   @OriginalMember(
      owner = "client!sb",
      name = "d",
      descriptor = "I"
   )
   public static int field4071;
   @OriginalMember(
      owner = "client!sb",
      name = "p",
      descriptor = "I"
   )
   public static int field4072;
   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "I"
   )
   public int field4073;
   @OriginalMember(
      owner = "client!sb",
      name = "e",
      descriptor = "I"
   )
   public static int field4076;
   @OriginalMember(
      owner = "client!sb",
      name = "o",
      descriptor = "I"
   )
   public int field4078;
   @OriginalMember(
      owner = "client!sb",
      name = "x",
      descriptor = "I"
   )
   private int field4079;
   @OriginalMember(
      owner = "client!sb",
      name = "s",
      descriptor = "I"
   )
   public int field4080;
   @OriginalMember(
      owner = "client!sb",
      name = "t",
      descriptor = "I"
   )
   public int field4082;
   @OriginalMember(
      owner = "client!sb",
      name = "m",
      descriptor = "I"
   )
   public int field4084;
   @OriginalMember(
      owner = "client!sb",
      name = "h",
      descriptor = "I"
   )
   public static int field4085;
   @OriginalMember(
      owner = "client!sb",
      name = "j",
      descriptor = "I"
   )
   public int field4086;
   @OriginalMember(
      owner = "client!sb",
      name = "r",
      descriptor = "I"
   )
   public static int field4087;
   @OriginalMember(
      owner = "client!sb",
      name = "l",
      descriptor = "I"
   )
   public static int field4088;
   @OriginalMember(
      owner = "client!sb",
      name = "c",
      descriptor = "I"
   )
   public int field4089;
   @OriginalMember(
      owner = "client!sb",
      name = "g",
      descriptor = "I"
   )
   public int field4090;
   @OriginalMember(
      owner = "client!sb",
      name = "i",
      descriptor = "I"
   )
   public static int field4091;
   @OriginalMember(
      owner = "client!sb",
      name = "k",
      descriptor = "J"
   )
   public long field4077;

   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "(IZLwm;)V"
   )
   private final void method2304(int arg0, boolean arg1, class594 arg2) {
      boolean var4 = client.field4273;

      try {
         if (!arg1) {
            label78: {
               if (~arg0 != -2) {
                  if (~arg0 == -3) {
                     arg2.method4288((byte)74);
                     if (!var4) {
                        break label78;
                     }
                  }

                  if (~arg0 != -4) {
                     if (arg0 == 4) {
                        this.field4090 = arg2.method4288((byte)71);
                        this.field4078 = arg2.method4302(!arg1);
                        if (!var4) {
                           break label78;
                        }
                     }

                     if (~arg0 != -7) {
                        if (~arg0 != -9) {
                           if (arg0 == 9) {
                              this.field4081 = 1;
                              if (!var4) {
                                 break label78;
                              }
                           }

                           if (arg0 != 10) {
                              break label78;
                           }

                           this.field4075 = true;
                           if (!var4) {
                              break label78;
                           }
                        }

                        this.field4074 = 1;
                        if (!var4) {
                           break label78;
                        }
                     }

                     this.field4089 = arg2.method4288((byte)93);
                     if (!var4) {
                        break label78;
                     }
                  }

                  this.field4084 = arg2.method4302(true);
                  this.field4082 = arg2.method4302(true);
                  this.field4070 = arg2.method4302(true);
                  if (!var4) {
                     break label78;
                  }
               }

               this.field4079 = arg2.method4280(-19104);
            }

            ++field4072;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4092[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4092[3] : field4092[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "(IZBLqh;II)V"
   )
   public static final void method2305(int arg0, boolean arg1, byte arg2, class74 arg3, int arg4, int arg5) {
      try {
         if (arg2 > 110) {
            ++field4088;
            class244.method1828(arg5, arg0, arg3, arg4, arg1, -1, 0L);
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field4092[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4092[3] : field4092[5]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2306(boolean arg0) {
      try {
         if (arg0) {
            method2308(102, 42);
         }

         field4083 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4092[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2307(int arg0) {
      boolean var2 = client.field4273;

      try {
         this.field4086 = class192.field2341[this.field4079 << 3];
         ++field4068;
         long var3 = (long)this.field4084;
         long var5 = (long)this.field4082;
         long var7 = (long)this.field4070;
         this.field4073 = (int)Math.sqrt((double)(var3 * var3 + var5 * var5 + var7 * var7));
         if (this.field4078 == arg0) {
            this.field4078 = 1;
         }

         label35: {
            if (~this.field4090 != -1) {
               if (~this.field4090 != -2) {
                  if (this.field4090 != 2) {
                     break label35;
                  }

                  this.field4077 = (long)(this.field4073 * 8 / this.field4078);
                  if (!var2) {
                     break label35;
                  }
               }

               this.field4077 = (long)(this.field4073 * 8 / this.field4078);
               this.field4077 *= this.field4077;
               if (!var2) {
                  break label35;
               }
            }

            this.field4077 = 2147483647L;
         }

         if (this.field4075) {
            this.field4073 *= -1;
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field4092[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method2308(int arg0, int arg1) {
      try {
         ++field4069;
         class27.field336 = arg0;
         class347.field4992.method4245(true);
         if (arg1 != 16194) {
            method2305(29, true, (byte)25, (class74)null, -47, -8);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4092[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method2309(int arg0) {
      try {
         class701.field10206 = new class693[50];
         class56.field610 = 0;
         ++field4076;
         if (arg0 != -1) {
            method2308(39, -1);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4092[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method2310(byte arg0) {
      boolean var1 = client.field4273;

      try {
         ++field4085;
         class575 var2 = (class575)class167.field2109.method3855(arg0 + -16);
         if (!var1 && var2 == null) {
            if (arg0 != -20) {
               field4091 = -29;
            }
         } else {
            do {
               class163 var3 = var2.field7908;
               if (~class369.field5205 >= ~var3.field2046) {
                  if (~class369.field5205 <= ~var3.field2062) {
                     var3.method1298((byte)36);
                     if (~var3.field2060 < -1) {
                        class243 var4 = (class243)class335.field4808.method1839(-112, (long)(var3.field2060 + -1));
                        if (var4 != null) {
                           class680 var5 = var4.field3043;
                           if (~var5.field999 <= -1 && class507.field7030 * 512 > var5.field999 && var5.field1003 >= 0 && class215.field2667 * 512 > var5.field1003) {
                              var3.method1299(var5.field1003, var5.field999, 50560, class369.field5205, class687.method5016(var5.field999, var3.field1001, var5.field1003, 2) - var3.field2065);
                           }
                        }
                     }

                     if (var3.field2060 < 0) {
                        int var6 = -var3.field2060 + -1;
                        class404 var7;
                        if (~class602.field8397 != ~var6) {
                           var7 = class136.field1773[var6];
                           if (var1) {
                              var7 = class278.field3709;
                           }
                        } else {
                           var7 = class278.field3709;
                        }

                        if (var7 != null && var7.field999 >= 0 && var7.field999 < class507.field7030 * 512 && var7.field1003 >= 0 && class215.field2667 * 512 > var7.field1003) {
                           var3.method1299(var7.field1003, var7.field999, arg0 ^ -50580, class369.field5205, class687.method5016(var7.field999, var3.field1001, var7.field1003, arg0 + 22) - var3.field2065);
                        }
                     }

                     var3.method1297((byte)94, class291.field3846);
                     class239.method1792(var3, true);
                     if (var1) {
                        var2.method3609(83);
                        var3.method1301((byte)18);
                     }
                  }
               } else {
                  var2.method3609(83);
                  var3.method1301((byte)18);
               }

               var2 = (class575)class167.field2109.method3866((byte)115);
            } while(var2 != null);

            if (arg0 != -20) {
               field4091 = -29;
            }
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field4092[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "(Lwm;Z)V"
   )
   public final void method2311(class594 arg0, boolean arg1) {
      boolean var3 = client.field4273;

      try {
         if (arg1) {
            method2308(-115, -39);
         }

         ++field4071;

         do {
            int var4 = arg0.method4288((byte)82);
            if (~var4 == -1) {
               break;
            }

            this.method2304(var4, false, arg0);
         } while(!var3);

      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4092[7] + (arg0 != null ? field4092[3] : field4092[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2312(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 97);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2313(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 118;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 97;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
