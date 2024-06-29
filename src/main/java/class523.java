import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class523 {
   @OriginalMember(
      owner = "client!jb",
      name = "k",
      descriptor = "B"
   )
   public byte field7160;
   @OriginalMember(
      owner = "client!jb",
      name = "c",
      descriptor = "B"
   )
   public byte field7163;
   @OriginalMember(
      owner = "client!jb",
      name = "j",
      descriptor = "I"
   )
   public int field7156;
   @OriginalMember(
      owner = "client!jb",
      name = "g",
      descriptor = "S"
   )
   public short field7155;
   @OriginalMember(
      owner = "client!jb",
      name = "f",
      descriptor = "S"
   )
   public short field7164;
   @OriginalMember(
      owner = "client!jb",
      name = "d",
      descriptor = "I"
   )
   public int field7157;
   @OriginalMember(
      owner = "client!jb",
      name = "b",
      descriptor = "Z"
   )
   public boolean field7159;
   @OriginalMember(
      owner = "client!jb",
      name = "i",
      descriptor = "S"
   )
   public short field7162;
   @OriginalMember(
      owner = "client!jb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7166 = new String[]{method3785(method3784("4X,\u001ay0Sv\u00188")), method3785(method3784("4X,d8")), method3785(method3784("bYmJ-8\\d@v8\u0004\"\t0")), method3785(method3784("~\u0017<")), method3785(method3784("%\u0014,\bm")), method3785(method3784("0OnJ")), method3785(method3784("4X,g8"))};
   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "I"
   )
   public static int field7165 = 0;
   @OriginalMember(
      owner = "client!jb",
      name = "e",
      descriptor = "I"
   )
   public static int field7158;
   @OriginalMember(
      owner = "client!jb",
      name = "h",
      descriptor = "I"
   )
   public static int field7161;

   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "(ILeb;Lha;)V"
   )
   public static final void method3782(int arg0, class657 arg1, class65 arg2) {
      try {
         ++field7158;
         boolean var3 = class645.field9054.method481(arg1.field9226, arg1.field9274, arg1.field9347, arg2, !arg1.field9240 ? null : class278.field3709.field5672, arg0 ^ -16777109, arg0 | arg1.field9355, arg1.field9345) == null;
         if (var3) {
            class543.field7412.method3859(2, new class341(arg1.field9345, arg1.field9274, arg1.field9347, -16777216 | arg1.field9355, arg1.field9226, arg1.field9240));
            class383.method2943(false, arg1);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7166[6] + arg0 + ',' + (arg1 != null ? field7166[4] : field7166[5]) + ',' + (arg2 != null ? field7166[4] : field7166[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "(Lha;I)V"
   )
   public static final void method3783(class65 arg0, int arg1) {
      boolean var2 = client.field4273;

      try {
         ++field7161;
         if ((~class234.field2899 <= -3 || class221.field2764) && class602.field8398 == null) {
            String var4;
            label135: {
               if (!class221.field2764 || ~class234.field2899 <= -3) {
                  if (!class182.field2251 || !class42.field495.method3876(126, 81) || class234.field2899 <= 2) {
                     class241 var3 = class717.field10512;
                     if (var3 == null) {
                        return;
                     }

                     var4 = class92.method870(-2545, var3);
                     int[] var5 = null;
                     if (!class374.method2898(-119, var3.field2993)) {
                        if (~var3.field3004 != 0) {
                           var5 = class645.field9054.method485(0, var3.field3004).field3392;
                        } else if (class550.method3974((byte)-110, var3.field2993)) {
                           class243 var6 = (class243)class335.field4808.method1839(-112, (long)((int)var3.field3010));
                           if (var6 != null) {
                              class680 var7 = var6.field3043;
                              class392 var8 = var7.field9989;
                              if (var8.field5516 != null) {
                                 var8 = var8.method2986(46, class259.field3320);
                              }

                              if (var8 != null) {
                                 var5 = var8.field5527;
                              }
                           }
                        } else if (class242.method1814(-58, var3.field2993)) {
                           Object var9 = null;
                           class774 var10;
                           if (~var3.field2993 != -1008) {
                              var10 = class472.field6533.method3586(64, (int)(2147483647L & var3.field3010 >>> 32));
                           } else {
                              var10 = class472.field6533.method3586(64, (int)var3.field3010);
                           }

                           if (var10.field11186 != null) {
                              var10 = var10.method5539(class259.field3320, 36);
                           }

                           if (var10 != null) {
                              var5 = var10.field11223;
                           }
                        }
                     } else {
                        var5 = class645.field9054.method485(0, (int)var3.field3010).field3392;
                     }

                     if (var5 == null) {
                        break label135;
                     }

                     var4 = var4 + class132.method1111(-21996, var5);
                     if (!var2) {
                        break label135;
                     }
                  }

                  var4 = class92.method870(-2545, class717.field10512);
                  if (!var2) {
                     break label135;
                  }
               }

               var4 = class460.field6309 + class551.field7553.method3980(class494.field6787, true) + class88.field1123 + field7166[3];
            }

            if (arg1 > -69) {
               field7165 = 60;
            }

            if (class234.field2899 > 2) {
               var4 = var4 + field7166[2] + (class234.field2899 + -2) + class551.field7546.method3980(class494.field6787, true);
            }

            if (class423.field5944 != null) {
               class66 var11 = class423.field5944.method4756(arg0, (byte)-116);
               if (var11 == null) {
                  var11 = class101.field1310;
               }

               var11.method615(class423.field5944.field9258, class768.field11077, class31.field369, class423.field5944.field9379, var4, class423.field5944.field9355, class25.field323, class423.field5944.field9360, -15587, class423.field5944.field9252, class771.field11111, class423.field5944.field9203, class310.field4111, class606.field8494, class249.field3122);
               class480.method3499(class31.field369[3], 0, class31.field369[0], class31.field369[1], class31.field369[2]);
            } else if (class155.field2004 != null && class551.field7585 == class381.field5334) {
               int var12 = class101.field1310.method616(var4, class606.field8494, class768.field11077, 16777215, 0, class174.field2174 - -16, class771.field11111, class623.field8694 + 4, (byte)82, class25.field323);
               class480.method3499(16, 0, class623.field8694 + 4, class174.field2174, class101.field1304.method4803(var4, (byte)70) + var12);
            }
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field7166[1] + (arg0 != null ? field7166[4] : field7166[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "<init>",
      descriptor = "(IIIIIIIIIZI)V"
   )
   public class523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
      try {
         this.field7160 = (byte)arg7;
         this.field7163 = (byte)arg8;
         this.field7156 = arg10;
         this.field7155 = (short)arg6;
         this.field7164 = (short)arg5;
         this.field7157 = arg0;
         this.field7159 = arg9;
         this.field7162 = (short)arg4;
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field7166[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3784(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3785(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 58;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 38;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
