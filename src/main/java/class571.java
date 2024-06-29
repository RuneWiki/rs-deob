import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class571 {
   @OriginalMember(
      owner = "client!kga",
      name = "d",
      descriptor = "I"
   )
   public int field8511 = -1;
   @OriginalMember(
      owner = "client!kga",
      name = "g",
      descriptor = "Z"
   )
   public boolean field8508 = false;
   @OriginalMember(
      owner = "client!kga",
      name = "h",
      descriptor = "Z"
   )
   public boolean field8512 = false;
   @OriginalMember(
      owner = "client!kga",
      name = "j",
      descriptor = "I"
   )
   public int field8513 = 1;
   @OriginalMember(
      owner = "client!kga",
      name = "i",
      descriptor = "I"
   )
   public int field8515 = 64;
   @OriginalMember(
      owner = "client!kga",
      name = "f",
      descriptor = "I"
   )
   public int field8517 = 2;
   @OriginalMember(
      owner = "client!kga",
      name = "c",
      descriptor = "I"
   )
   public int field8516 = 64;
   @OriginalMember(
      owner = "client!kga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8518 = new String[]{method4237(method4236("'7Fbbd")), method4237(method4236("7~\tb\\")), method4237(method4236("\"%K ")), method4237(method4236("'7Fbcd")), method4237(method4236("'7Fbed")), method4237(method4236("'7Fbgd")), method4237(method4236("'7Fbdd")), method4237(method4236("'7Fb`d"))};
   @OriginalMember(
      owner = "client!kga",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field8509 = new int[50];
   @OriginalMember(
      owner = "client!kga",
      name = "e",
      descriptor = "I"
   )
   public static int field8505;
   @OriginalMember(
      owner = "client!kga",
      name = "l",
      descriptor = "I"
   )
   public static int field8506;
   @OriginalMember(
      owner = "client!kga",
      name = "m",
      descriptor = "I"
   )
   public static int field8507;
   @OriginalMember(
      owner = "client!kga",
      name = "k",
      descriptor = "I"
   )
   public static int field8510;
   @OriginalMember(
      owner = "client!kga",
      name = "a",
      descriptor = "I"
   )
   public static int field8514;

   @OriginalMember(
      owner = "client!kga",
      name = "a",
      descriptor = "(IBILjj;)V"
   )
   private final void method4230(int arg0, byte arg1, int arg2, class128 arg3) {
      try {
         ++field8506;
         if (arg1 < 40) {
            this.method4230(62, (byte)86, -77, (class128)null);
         }

         if (~arg0 != -2) {
            if (~arg0 != -3) {
               if (arg0 != 3) {
                  if (~arg0 != -5) {
                     if (~arg0 != -6) {
                        if (~arg0 != -7) {
                           if (~arg0 == -8) {
                              this.field8512 = true;
                              return;
                           }
                        } else {
                           this.field8508 = true;
                        }

                     } else {
                        this.field8513 = arg3.method1104(255);
                     }
                  } else {
                     this.field8517 = arg3.method1104(255);
                  }
               } else {
                  arg3.method1047((byte)-110);
               }
            } else {
               this.field8515 = 1 + arg3.method1038((byte)-101);
               this.field8516 = arg3.method1038((byte)-109) + 1;
            }
         } else {
            this.field8511 = arg3.method1038((byte)-112);
            if (~this.field8511 == -65536) {
               this.field8511 = -1;
            }
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field8518[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8518[1] : field8518[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kga",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4231(int arg0) {
      int var1 = client.field4530;

      try {
         label32: {
            ++field8507;
            int var2 = class261.field3566.field9442.method1403(arg0 + 117);
            if (var2 != 0) {
               if (~var2 != -2) {
                  class767.method5555((byte)(class213.field2703 + -4 & 255), (byte)-128);
                  class348.method2725(2, true);
                  if (var1 == 0) {
                     break label32;
                  }
               }

               class767.method5555((byte)0, (byte)-103);
               class348.method2725(512, true);
               if (class65.field797 == null) {
                  break label32;
               }

               class763.method5528(arg0 ^ -61);
               if (var1 == 0) {
                  break label32;
               }
            }

            class393.field5962 = null;
            class348.method2725(0, true);
         }

         class660.field9560 = class551.field8158;
         if (arg0 != 2) {
            field8509 = null;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8518[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kga",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4232(byte arg0) {
      try {
         field8509 = null;
         if (arg0 != -29) {
            field8509 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8518[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kga",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public static final void method4233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         label25: {
            ++field8514;
            if (~class197.field2442 >= ~arg5 && ~arg3 >= ~class100.field1232 && class506.field7472 <= arg7 && class22.field234 >= arg2) {
               class167.method1349(arg4, arg1, arg5, arg3, arg2, arg7, 1, arg0);
               if (client.field4530 == 0) {
                  break label25;
               }
            }

            class589.method4336(arg0, arg5, arg4, arg2, arg1, (byte)31, arg7, arg3);
         }

         int var8 = -104 / ((-70 - arg6) / 54);
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field8518[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kga",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method4234(int arg0, int arg1) {
      try {
         class748 var2 = class402.field6170;
         synchronized(class402.field6170) {
            class402.field6170.method5453(arg0, false);
         }

         int var3 = 27 / ((arg1 - -85) / 35);
         ++field8510;
         class748 var4 = class134.field1713;
         synchronized(class134.field1713) {
            class134.field1713.method5453(arg0, false);
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field8518[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kga",
      name = "a",
      descriptor = "(IILjj;)V"
   )
   public final void method4235(int arg0, int arg1, class128 arg2) {
      int var4 = client.field4530;

      try {
         if (arg1 >= 12) {
            while(true) {
               int var5 = arg2.method1104(255);
               if (var5 != 0) {
                  this.method4230(var5, (byte)107, arg0, arg2);
                  if (var4 != 0) {
                     break;
                  }

                  if (var4 == 0) {
                     continue;
                  }
               }

               ++field8505;
               break;
            }

         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field8518[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8518[1] : field8518[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4236(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 33);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4237(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 76;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 33;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
