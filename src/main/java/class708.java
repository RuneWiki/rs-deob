import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class708 {
   @OriginalMember(
      owner = "client!qf",
      name = "j",
      descriptor = "Lrw;"
   )
   private class788 field10299;
   @OriginalMember(
      owner = "client!qf",
      name = "i",
      descriptor = "I"
   )
   private int field10285;
   @OriginalMember(
      owner = "client!qf",
      name = "q",
      descriptor = "I"
   )
   private int field10288;
   @OriginalMember(
      owner = "client!qf",
      name = "o",
      descriptor = "Lld;"
   )
   private class178 field10301;
   @OriginalMember(
      owner = "client!qf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10302 = new String[]{method5152(method5151(")=u7%")), method5152(method5151("<f7u")), method5152(method5151("#uuTp")), method5152(method5151("#uu[p")), method5152(method5151("#uuUp")), method5152(method5151("#uuPp")), method5152(method5151("!-8j")), method5152(method5151("#uuZp")), method5152(method5151("#uuRp")), method5152(method5151("#uuWp")), method5152(method5151("#uu\\p")), method5152(method5151("#uu]p")), method5152(method5151("#uuSp")), method5152(method5151("#uu%1<z/'p")), method5152(method5151("#uuXp")), method5152(method5151("#uu^p")), method5152(method5151("#uuQp")), method5152(method5151("#uu_p"))};
   @OriginalMember(
      owner = "client!qf",
      name = "b",
      descriptor = "Lgh;"
   )
   public static class572 field10289 = new class572(17, 6);
   @OriginalMember(
      owner = "client!qf",
      name = "c",
      descriptor = "I"
   )
   public static int field10284;
   @OriginalMember(
      owner = "client!qf",
      name = "n",
      descriptor = "I"
   )
   public static int field10286;
   @OriginalMember(
      owner = "client!qf",
      name = "e",
      descriptor = "I"
   )
   public static int field10287;
   @OriginalMember(
      owner = "client!qf",
      name = "d",
      descriptor = "I"
   )
   public static int field10290;
   @OriginalMember(
      owner = "client!qf",
      name = "h",
      descriptor = "I"
   )
   public static int field10291;
   @OriginalMember(
      owner = "client!qf",
      name = "k",
      descriptor = "I"
   )
   public static int field10292;
   @OriginalMember(
      owner = "client!qf",
      name = "l",
      descriptor = "I"
   )
   public static int field10293;
   @OriginalMember(
      owner = "client!qf",
      name = "a",
      descriptor = "I"
   )
   public static int field10294;
   @OriginalMember(
      owner = "client!qf",
      name = "r",
      descriptor = "I"
   )
   public static int field10295;
   @OriginalMember(
      owner = "client!qf",
      name = "g",
      descriptor = "I"
   )
   public static int field10296;
   @OriginalMember(
      owner = "client!qf",
      name = "p",
      descriptor = "I"
   )
   public static int field10297;
   @OriginalMember(
      owner = "client!qf",
      name = "m",
      descriptor = "I"
   )
   public static int field10298;
   @OriginalMember(
      owner = "client!qf",
      name = "f",
      descriptor = "I"
   )
   public static int field10300;

   @OriginalMember(
      owner = "client!qf",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method5137(byte arg0) {
      try {
         if (arg0 != 72) {
            field10289 = null;
         }

         field10289 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10302[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "a",
      descriptor = "(ILtea;)V"
   )
   private final void method5138(int arg0, class249 arg1) {
      try {
         int var3 = 1 / ((arg0 - 74) / 46);
         ++field10296;
         if (arg1 != null) {
            arg1.method154(112);
            arg1.method2385(117);
            this.field10288 += arg1.field3580;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10302[15] + arg0 + ',' + (arg1 != null ? field10302[0] : field10302[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "a",
      descriptor = "(Lcba;B)Ljava/lang/Object;"
   )
   public final Object method5139(class574 arg0, byte arg1) {
      boolean var3 = client.field4564;

      try {
         class249 var7;
         Object var8;
         label67: {
            ++field10291;
            int var4 = -25 / (arg1 / 33);
            long var5 = arg0.method1833(-28737);
            var7 = (class249)this.field10301.method1572(var5, -16289);
            if (var3) {
               if (var7.field3578.method1834(-19799, arg0)) {
                  var8 = var7.method2023((byte)59);
                  if (var8 != null) {
                     break label67;
                  }

                  var7.method154(-104);
                  var7.method2385(117);
                  this.field10288 += var7.field3580;
                  if (var3) {
                     break label67;
                  }
               }

               var7 = (class249)this.field10301.method1568(0);
            }

            label66:
            while(true) {
               while(var7 != null) {
                  if (var7.field3578.method1834(-19799, arg0)) {
                     var8 = var7.method2023((byte)59);
                     if (var8 != null) {
                        break label66;
                     }

                     var7.method154(-104);
                     var7.method2385(117);
                     this.field10288 += var7.field3580;
                     if (var3) {
                        break label66;
                     }
                  }

                  var7 = (class249)this.field10301.method1568(0);
               }

               if (!var3) {
                  return null;
               }

               var7 = (class249)this.field10301.method1568(0);
            }
         }

         if (!var7.method2022((byte)125)) {
            this.field10299.method5681(var7, (byte)-107);
            var7.field4416 = 0L;
            if (!var3) {
               return var8;
            }
         }

         class278 var9 = new class278(arg0, var8, var7.field3580);
         this.field10301.method1566(var9, 24742, var7.field347);
         this.field10299.method5681(var9, (byte)-105);
         var9.field4416 = 0L;
         var7.method154(-104);
         var7.method2385(117);
         return var8;
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field10302[16] + (arg0 != null ? field10302[0] : field10302[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "a",
      descriptor = "(Ljava/io/File;[BII)V"
   )
   public static final void method5140(File arg0, byte[] arg1, int arg2, int arg3) throws IOException {
      try {
         ++field10292;
         DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));

         try {
            var4.readFully(arg1, arg2, arg3);
         } catch (EOFException var6) {
         }

         var4.close();
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field10302[9] + (arg0 != null ? field10302[0] : field10302[1]) + ',' + (arg1 != null ? field10302[0] : field10302[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method5141(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qf",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method5142(boolean arg0) {
      boolean var1 = client.field4564;

      try {
         int var2 = 0;
         int var10000;
         if (!arg0) {
            field10289 = null;
            if (var1) {
               var10000 = 0;
            } else if (~var2 <= ~class608.field8732.length) {
               var10000 = field10298 + 1;
               if (!var1) {
                  field10298 = var10000;
                  return;
               }
            } else {
               var10000 = 0;
            }
         } else if (~var2 <= ~class608.field8732.length) {
            var10000 = field10298 + 1;
            if (!var1) {
               field10298 = var10000;
               return;
            }
         } else {
            var10000 = 0;
         }

         while(true) {
            label96: {
               int var3 = var10000;
               int var4;
               if (var1) {
                  var4 = 0;
                  if (var1) {
                     class608.field8732[var2][var3][var4] = 0;
                     ++var4;
                  }
               } else {
                  if (var3 >= class608.field8732[0].length) {
                     break label96;
                  }

                  var4 = 0;
                  if (var1) {
                     class608.field8732[var2][var3][var4] = 0;
                     ++var4;
                  }
               }

               while(true) {
                  while(~var4 > ~class608.field8732[0][0].length) {
                     class608.field8732[var2][var3][var4] = 0;
                     ++var4;
                  }

                  if (!var1) {
                     ++var3;
                     if (var3 >= class608.field8732[0].length) {
                        break;
                     }

                     var4 = 0;
                     if (var1) {
                        class608.field8732[var2][var3][var4] = 0;
                        ++var4;
                     }
                  } else {
                     ++var4;
                  }
               }
            }

            ++var2;
            if (~var2 <= ~class608.field8732.length) {
               var10000 = field10298 + 1;
               if (!var1) {
                  field10298 = var10000;
                  return;
               }
            } else {
               var10000 = 0;
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field10302[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method5143(int arg0) {
      try {
         if (arg0 != 0) {
            this.method5150((byte)-112, (class574)null, (Object)null);
         }

         ++field10284;
         return this.field10288;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10302[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method5144(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field10293;
         class249 var3 = (class249)this.field10299.method5680(false);
         int var10000;
         if (var2) {
            var10000 = var3.method2022((byte)127);
         } else if (var3 == null) {
            var10000 = arg0;
            if (!var2) {
               if (arg0 <= 30) {
                  field10289 = null;
                  return;
               }

               return;
            }
         } else {
            var10000 = var3.method2022((byte)127);
         }

         while(true) {
            if (var10000 != 0) {
               var3.method154(-127);
               var3.method2385(117);
               this.field10288 += var3.field3580;
            }

            var3 = (class249)this.field10299.method5676(-13612);
            if (var3 == null) {
               var10000 = arg0;
               if (!var2) {
                  if (arg0 <= 30) {
                     field10289 = null;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = var3.method2022((byte)127);
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10302[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "a",
      descriptor = "(ILjfa;)V"
   )
   public static final void method5145(int arg0, class303 arg1) {
      try {
         ++field10287;
         if (arg0 == 17) {
            int var3;
            int var4;
            label25: {
               class303 var2 = class98.method946(arg1, -1);
               if (var2 != null) {
                  var3 = var2.field4226;
                  var4 = var2.field4308;
                  if (!client.field4564) {
                     break label25;
                  }
               }

               var4 = class720.field10406;
               var3 = class218.field3296;
            }

            class226.method1887(var3, arg1, false, var4, false);
            class381.method2970(var3, var4, arg1, 1);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field10302[2] + arg0 + ',' + (arg1 != null ? field10302[0] : field10302[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "a",
      descriptor = "(Lcba;Ljava/lang/Object;IB)V"
   )
   private final void method5146(class574 param1, Object param2, int param3, byte param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qf",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method5147(byte arg0) {
      try {
         ++field10300;
         if (arg0 <= 54) {
            method5142(true);
         }

         return this.field10285;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10302[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "a",
      descriptor = "(BLcba;)V"
   )
   private final void method5148(byte param1, class574 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qf",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method5149(boolean arg0) {
      try {
         ++field10297;
         this.field10299.method5675((byte)95);
         this.field10301.method1570((byte)15);
         this.field10288 = this.field10285;
         if (arg0) {
            this.method5147((byte)-63);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10302[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "a",
      descriptor = "(BLcba;Ljava/lang/Object;)V"
   )
   public final void method5150(byte arg0, class574 arg1, Object arg2) {
      try {
         this.method5146(arg1, arg2, 1, (byte)0);
         ++field10295;
         int var4 = 74 / ((-40 - arg0) / 50);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field10302[8] + arg0 + ',' + (arg1 != null ? field10302[0] : field10302[1]) + ',' + (arg2 != null ? field10302[0] : field10302[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class708(int arg0) {
      boolean var2 = client.field4564;
      super();
      this.field10299 = new class788();

      try {
         this.field10285 = arg0;
         this.field10288 = arg0;
         int var3 = 1;
         if (var2) {
            var3 += var3;
         }

         while(arg0 > var3 + var3) {
            var3 += var3;
         }

         this.field10301 = new class178(var3);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10302[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5151(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5152(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 82;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
