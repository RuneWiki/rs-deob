package deob;

@ObfuscatedName("BBRQYCNY")
public class BBRQYCNY {

	@ObfuscatedName("BBRQYCNY.e")
	public int field8 = 0;

	@ObfuscatedName("BBRQYCNY.f")
	public int field9 = 0;

	@ObfuscatedName("BBRQYCNY.g")
	public int field10;

	@ObfuscatedName("BBRQYCNY.h")
	public int field11;

	@ObfuscatedName("BBRQYCNY.i")
	public int[][] field12;

	public BBRQYCNY(int arg0, int arg1) {
		field10 = arg0;
		field11 = arg1;
		field12 = new int[field10][field11];
		method39();
	}

	@ObfuscatedName("BBRQYCNY.a()V")
	public void method39() {
		for (int var1 = 0; var1 < field10; var1++) {
			for (int var2 = 0; var2 < field11; var2++) {
				if (var1 == 0 || var2 == 0 || field10 - 1 == var1 || field11 - 1 == var2) {
					field12[var1][var2] = 0xFFFFFF;
				} else {
					field12[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("BBRQYCNY.a(IIIIZI)V")
	public void method40(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		arg4 -= field8;
		arg1 -= field9;
		if (arg2 == 0) {
			if (arg0 == 0) {
				method43(arg4, arg1, 128);
				method43(arg4 - 1, arg1, 8);
			}

			if (arg0 == 1) {
				method43(arg4, arg1, 2);
				method43(arg4, arg1 + 1, 32);
			}

			if (arg0 == 2) {
				method43(arg4, arg1, 8);
				method43(arg4 + 1, arg1, 128);
			}

			if (arg0 == 3) {
				method43(arg4, arg1, 32);
				method43(arg4, arg1 - 1, 2);
			}
		}

		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				method43(arg4, arg1, 1);
				method43(arg4 - 1, arg1 + 1, 16);
			}

			if (arg0 == 1) {
				method43(arg4, arg1, 4);
				method43(arg4 + 1, arg1 + 1, 64);
			}

			if (arg0 == 2) {
				method43(arg4, arg1, 16);
				method43(arg4 + 1, arg1 - 1, 1);
			}

			if (arg0 == 3) {
				method43(arg4, arg1, 64);
				method43(arg4 - 1, arg1 - 1, 4);
			}
		}

		if (arg2 == 2) {
			if (arg0 == 0) {
				method43(arg4, arg1, 130);
				method43(arg4 - 1, arg1, 8);
				method43(arg4, arg1 + 1, 32);
			}

			if (arg0 == 1) {
				method43(arg4, arg1, 10);
				method43(arg4, arg1 + 1, 32);
				method43(arg4 + 1, arg1, 128);
			}

			if (arg0 == 2) {
				method43(arg4, arg1, 40);
				method43(arg4 + 1, arg1, 128);
				method43(arg4, arg1 - 1, 2);
			}

			if (arg0 == 3) {
				method43(arg4, arg1, 160);
				method43(arg4, arg1 - 1, 2);
				method43(arg4 - 1, arg1, 8);
			}
		}

		if (arg3) {
			if (arg2 == 0) {
				if (arg0 == 0) {
					method43(arg4, arg1, 0x10000);
					method43(arg4 - 1, arg1, 4096);
				}

				if (arg0 == 1) {
					method43(arg4, arg1, 1024);
					method43(arg4, arg1 + 1, 16384);
				}

				if (arg0 == 2) {
					method43(arg4, arg1, 4096);
					method43(arg4 + 1, arg1, 0x10000);
				}

				if (arg0 == 3) {
					method43(arg4, arg1, 16384);
					method43(arg4, arg1 - 1, 1024);
				}
			}

			if (arg2 == 1 || arg2 == 3) {
				if (arg0 == 0) {
					method43(arg4, arg1, 512);
					method43(arg4 - 1, arg1 + 1, 8192);
				}

				if (arg0 == 1) {
					method43(arg4, arg1, 2048);
					method43(arg4 + 1, arg1 + 1, 32768);
				}

				if (arg0 == 2) {
					method43(arg4, arg1, 8192);
					method43(arg4 + 1, arg1 - 1, 512);
				}

				if (arg0 == 3) {
					method43(arg4, arg1, 32768);
					method43(arg4 - 1, arg1 - 1, 2048);
				}
			}

			if (arg2 == 2) {
				if (arg0 == 0) {
					method43(arg4, arg1, 66560);
					method43(arg4 - 1, arg1, 4096);
					method43(arg4, arg1 + 1, 16384);
				}

				if (arg0 == 1) {
					method43(arg4, arg1, 5120);
					method43(arg4, arg1 + 1, 16384);
					method43(arg4 + 1, arg1, 0x10000);
				}

				if (arg0 == 2) {
					method43(arg4, arg1, 20480);
					method43(arg4 + 1, arg1, 0x10000);
					method43(arg4, arg1 - 1, 1024);
				}

				if (arg0 == 3) {
					method43(arg4, arg1, 81920);
					method43(arg4, arg1 - 1, 1024);
					method43(arg4 - 1, arg1, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("BBRQYCNY.a(IIIIIZI)V")
	public void method41(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg0 -= field8;
		arg1 -= field9;

		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg2;
			arg2 = arg5;
			arg5 = var8;
		}

		for (int var9 = arg0; var9 < arg0 + arg2; var9++) {
			if (var9 >= 0 && var9 < field10) {
				for (int var10 = arg1; var10 < arg1 + arg5; var10++) {
					if (var10 >= 0 && var10 < field11) {
						method43(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("BBRQYCNY.a(III)V")
	public void method42(int arg0, int arg1) {
		arg1 -= field8;
		arg0 -= field9;
		field12[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("BBRQYCNY.b(III)V")
	public void method43(int arg0, int arg1, int arg2) {
		field12[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("BBRQYCNY.a(ZIIIIZ)V")
	public void method44(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		arg1 -= field8;
		arg2 -= field9;
		if (arg0 == 0) {
			if (arg3 == 0) {
				method46(128, arg1, arg2);
				method46(8, arg1 - 1, arg2);
			}

			if (arg3 == 1) {
				method46(2, arg1, arg2);
				method46(32, arg1, arg2 + 1);
			}

			if (arg3 == 2) {
				method46(8, arg1, arg2);
				method46(128, arg1 + 1, arg2);
			}

			if (arg3 == 3) {
				method46(32, arg1, arg2);
				method46(2, arg1, arg2 - 1);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				method46(1, arg1, arg2);
				method46(16, arg1 - 1, arg2 + 1);
			}

			if (arg3 == 1) {
				method46(4, arg1, arg2);
				method46(64, arg1 + 1, arg2 + 1);
			}

			if (arg3 == 2) {
				method46(16, arg1, arg2);
				method46(1, arg1 + 1, arg2 - 1);
			}

			if (arg3 == 3) {
				method46(64, arg1, arg2);
				method46(4, arg1 - 1, arg2 - 1);
			}
		}

		if (arg0 == 2) {
			if (arg3 == 0) {
				method46(130, arg1, arg2);
				method46(8, arg1 - 1, arg2);
				method46(32, arg1, arg2 + 1);
			}

			if (arg3 == 1) {
				method46(10, arg1, arg2);
				method46(32, arg1, arg2 + 1);
				method46(128, arg1 + 1, arg2);
			}

			if (arg3 == 2) {
				method46(40, arg1, arg2);
				method46(128, arg1 + 1, arg2);
				method46(2, arg1, arg2 - 1);
			}

			if (arg3 == 3) {
				method46(160, arg1, arg2);
				method46(2, arg1, arg2 - 1);
				method46(8, arg1 - 1, arg2);
			}
		}

		if (arg4) {
			if (arg0 == 0) {
				if (arg3 == 0) {
					method46(0x10000, arg1, arg2);
					method46(4096, arg1 - 1, arg2);
				}

				if (arg3 == 1) {
					method46(1024, arg1, arg2);
					method46(16384, arg1, arg2 + 1);
				}

				if (arg3 == 2) {
					method46(4096, arg1, arg2);
					method46(0x10000, arg1 + 1, arg2);
				}

				if (arg3 == 3) {
					method46(16384, arg1, arg2);
					method46(1024, arg1, arg2 - 1);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg3 == 0) {
					method46(512, arg1, arg2);
					method46(8192, arg1 - 1, arg2 + 1);
				}

				if (arg3 == 1) {
					method46(2048, arg1, arg2);
					method46(32768, arg1 + 1, arg2 + 1);
				}

				if (arg3 == 2) {
					method46(8192, arg1, arg2);
					method46(512, arg1 + 1, arg2 - 1);
				}

				if (arg3 == 3) {
					method46(32768, arg1, arg2);
					method46(2048, arg1 - 1, arg2 - 1);
				}
			}

			if (arg0 == 2) {
				if (arg3 == 0) {
					method46(66560, arg1, arg2);
					method46(4096, arg1 - 1, arg2);
					method46(16384, arg1, arg2 + 1);
				}

				if (arg3 == 1) {
					method46(5120, arg1, arg2);
					method46(16384, arg1, arg2 + 1);
					method46(0x10000, arg1 + 1, arg2);
				}

				if (arg3 == 2) {
					method46(20480, arg1, arg2);
					method46(0x10000, arg1 + 1, arg2);
					method46(1024, arg1, arg2 - 1);
				}

				if (arg3 == 3) {
					method46(81920, arg1, arg2);
					method46(1024, arg1, arg2 - 1);
					method46(4096, arg1 - 1, arg2);
					return;
				}
			}
		}
	}

	@ObfuscatedName("BBRQYCNY.a(ZIIIIII)V")
	public void method45(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg0) {
			var7 += 0x20000;
		}

		arg4 -= field8;
		arg1 -= field9;

		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg2;
			arg2 = arg5;
			arg5 = var8;
		}

		for (int var9 = arg4; var9 < arg2 + arg4; var9++) {
			if (var9 >= 0 && var9 < field10) {
				for (int var10 = arg1; var10 < arg1 + arg5; var10++) {
					if (var10 >= 0 && var10 < field11) {
						method46(var7, var9, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("BBRQYCNY.a(IIZI)V")
	public void method46(int arg0, int arg1, int arg2) {
		field12[arg1][arg2] &= 0xFFFFFF - arg0;
	}

	@ObfuscatedName("BBRQYCNY.c(III)V")
	public void method47(int arg0, int arg1) {
		arg0 -= field8;
		arg1 -= field9;
		field12[arg0][arg1] &= 0xDFFFFF;
	}

	@ObfuscatedName("BBRQYCNY.a(IIIIIII)Z")
	public boolean method48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg2 && arg3 == arg4) {
			return true;
		}

		arg0 -= field8;
		arg4 -= field9;
		arg2 -= field8;
		arg3 -= field9;
		if (arg5 == 0) {
			if (arg1 == 0) {
				if (arg2 - 1 == arg0 && arg3 == arg4) {
					return true;
				}

				if (arg0 == arg2 && arg3 + 1 == arg4 && (field12[arg0][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg3 - 1 == arg4 && (field12[arg0][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg0 == arg2 && arg3 + 1 == arg4) {
					return true;
				}

				if (arg2 - 1 == arg0 && arg3 == arg4 && (field12[arg0][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg2 + 1 == arg0 && arg3 == arg4 && (field12[arg0][arg4] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg2 + 1 == arg0 && arg3 == arg4) {
					return true;
				}

				if (arg0 == arg2 && arg3 + 1 == arg4 && (field12[arg0][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg3 - 1 == arg4 && (field12[arg0][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg0 == arg2 && arg3 - 1 == arg4) {
					return true;
				}

				if (arg2 - 1 == arg0 && arg3 == arg4 && (field12[arg0][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg2 + 1 == arg0 && arg3 == arg4 && (field12[arg0][arg4] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg5 == 2) {
			if (arg1 == 0) {
				if (arg2 - 1 == arg0 && arg3 == arg4) {
					return true;
				}

				if (arg0 == arg2 && arg3 + 1 == arg4) {
					return true;
				}

				if (arg2 + 1 == arg0 && arg3 == arg4 && (field12[arg0][arg4] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg3 - 1 == arg4 && (field12[arg0][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg2 - 1 == arg0 && arg3 == arg4 && (field12[arg0][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg3 + 1 == arg4) {
					return true;
				}

				if (arg2 + 1 == arg0 && arg3 == arg4) {
					return true;
				}

				if (arg0 == arg2 && arg3 - 1 == arg4 && (field12[arg0][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg2 - 1 == arg0 && arg3 == arg4 && (field12[arg0][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg3 + 1 == arg4 && (field12[arg0][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg2 + 1 == arg0 && arg3 == arg4) {
					return true;
				}

				if (arg0 == arg2 && arg3 - 1 == arg4) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg2 - 1 == arg0 && arg3 == arg4) {
					return true;
				}

				if (arg0 == arg2 && arg3 + 1 == arg4 && (field12[arg0][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg2 + 1 == arg0 && arg3 == arg4 && (field12[arg0][arg4] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg3 - 1 == arg4) {
					return true;
				}
			}
		}

		if (arg5 == 9) {
			if (arg0 == arg2 && arg3 + 1 == arg4 && (field12[arg0][arg4] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg2 && arg3 - 1 == arg4 && (field12[arg0][arg4] & 0x2) == 0) {
				return true;
			}

			if (arg2 - 1 == arg0 && arg3 == arg4 && (field12[arg0][arg4] & 0x8) == 0) {
				return true;
			}

			if (arg2 + 1 == arg0 && arg3 == arg4 && (field12[arg0][arg4] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("BBRQYCNY.a(IIIIIIZ)Z")
	public boolean method49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg3 && arg1 == arg4) {
			return true;
		}

		arg0 -= field8;
		arg4 -= field9;
		arg3 -= field8;
		arg1 -= field9;
		if (arg5 == 6 || arg5 == 7) {
			if (arg5 == 7) {
				arg2 = arg2 + 2 & 0x3;
			}

			if (arg2 == 0) {
				if (arg3 + 1 == arg0 && arg1 == arg4 && (field12[arg0][arg4] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 - 1 == arg4 && (field12[arg0][arg4] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg3 - 1 == arg0 && arg1 == arg4 && (field12[arg0][arg4] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 - 1 == arg4 && (field12[arg0][arg4] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg3 - 1 == arg0 && arg1 == arg4 && (field12[arg0][arg4] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 + 1 == arg4 && (field12[arg0][arg4] & 0x20) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg3 + 1 == arg0 && arg1 == arg4 && (field12[arg0][arg4] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 + 1 == arg4 && (field12[arg0][arg4] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg5 == 8) {
			if (arg0 == arg3 && arg1 + 1 == arg4 && (field12[arg0][arg4] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg3 && arg1 - 1 == arg4 && (field12[arg0][arg4] & 0x2) == 0) {
				return true;
			}

			if (arg3 - 1 == arg0 && arg1 == arg4 && (field12[arg0][arg4] & 0x8) == 0) {
				return true;
			}

			if (arg3 + 1 == arg0 && arg1 == arg4 && (field12[arg0][arg4] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("BBRQYCNY.a(IBIIIIII)Z")
	public boolean method50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg1 + arg6 - 1;
		int var9 = arg2 + arg4 - 1;
		if (arg5 >= arg1 && arg5 <= var8 && arg3 >= arg4 && arg3 <= var9) {
			return true;
		}

		if (arg1 - 1 == arg5 && arg3 >= arg4 && arg3 <= var9 && (field12[arg5 - field8][arg3 - field9] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg5 && arg3 >= arg4 && arg3 <= var9 && (field12[arg5 - field8][arg3 - field9] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		}

		if (arg4 - 1 == arg3 && arg5 >= arg1 && arg5 <= var8 && (field12[arg5 - field8][arg3 - field9] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg3 && arg5 >= arg1 && arg5 <= var8 && (field12[arg5 - field8][arg3 - field9] & 0x20) == 0 && (arg0 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
