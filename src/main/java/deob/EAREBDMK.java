package deob;

@ObfuscatedName("EAREBDMK")
public class EAREBDMK {

	@ObfuscatedName("EAREBDMK.f")
	public int field611 = 0;

	@ObfuscatedName("EAREBDMK.g")
	public int field612 = 0;

	@ObfuscatedName("EAREBDMK.h")
	public int field613;

	@ObfuscatedName("EAREBDMK.i")
	public int field614;

	@ObfuscatedName("EAREBDMK.j")
	public int[][] field615;

	public EAREBDMK(int arg0, int arg1) {
		field613 = arg0;
		field614 = arg1;
		field615 = new int[field613][field614];
		method188();
	}

	@ObfuscatedName("EAREBDMK.a()V")
	public void method188() {
		for (int var1 = 0; var1 < field613; var1++) {
			for (int var2 = 0; var2 < field614; var2++) {
				if (var1 == 0 || var2 == 0 || field613 - 1 == var1 || field614 - 1 == var2) {
					field615[var1][var2] = 0xFFFFFF;
				} else {
					field615[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("EAREBDMK.a(IIIIZI)V")
	public void method189(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		arg2 -= field611;
		arg1 -= field612;
		if (arg4 == 0) {
			if (arg0 == 0) {
				method192(arg2, arg1, 128);
				method192(arg2 - 1, arg1, 8);
			}

			if (arg0 == 1) {
				method192(arg2, arg1, 2);
				method192(arg2, arg1 + 1, 32);
			}

			if (arg0 == 2) {
				method192(arg2, arg1, 8);
				method192(arg2 + 1, arg1, 128);
			}

			if (arg0 == 3) {
				method192(arg2, arg1, 32);
				method192(arg2, arg1 - 1, 2);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				method192(arg2, arg1, 1);
				method192(arg2 - 1, arg1 + 1, 16);
			}

			if (arg0 == 1) {
				method192(arg2, arg1, 4);
				method192(arg2 + 1, arg1 + 1, 64);
			}

			if (arg0 == 2) {
				method192(arg2, arg1, 16);
				method192(arg2 + 1, arg1 - 1, 1);
			}

			if (arg0 == 3) {
				method192(arg2, arg1, 64);
				method192(arg2 - 1, arg1 - 1, 4);
			}
		}

		if (arg4 == 2) {
			if (arg0 == 0) {
				method192(arg2, arg1, 130);
				method192(arg2 - 1, arg1, 8);
				method192(arg2, arg1 + 1, 32);
			}

			if (arg0 == 1) {
				method192(arg2, arg1, 10);
				method192(arg2, arg1 + 1, 32);
				method192(arg2 + 1, arg1, 128);
			}

			if (arg0 == 2) {
				method192(arg2, arg1, 40);
				method192(arg2 + 1, arg1, 128);
				method192(arg2, arg1 - 1, 2);
			}

			if (arg0 == 3) {
				method192(arg2, arg1, 160);
				method192(arg2, arg1 - 1, 2);
				method192(arg2 - 1, arg1, 8);
			}
		}

		if (arg3) {
			if (arg4 == 0) {
				if (arg0 == 0) {
					method192(arg2, arg1, 0x10000);
					method192(arg2 - 1, arg1, 4096);
				}

				if (arg0 == 1) {
					method192(arg2, arg1, 1024);
					method192(arg2, arg1 + 1, 16384);
				}

				if (arg0 == 2) {
					method192(arg2, arg1, 4096);
					method192(arg2 + 1, arg1, 0x10000);
				}

				if (arg0 == 3) {
					method192(arg2, arg1, 16384);
					method192(arg2, arg1 - 1, 1024);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg0 == 0) {
					method192(arg2, arg1, 512);
					method192(arg2 - 1, arg1 + 1, 8192);
				}

				if (arg0 == 1) {
					method192(arg2, arg1, 2048);
					method192(arg2 + 1, arg1 + 1, 32768);
				}

				if (arg0 == 2) {
					method192(arg2, arg1, 8192);
					method192(arg2 + 1, arg1 - 1, 512);
				}

				if (arg0 == 3) {
					method192(arg2, arg1, 32768);
					method192(arg2 - 1, arg1 - 1, 2048);
				}
			}

			if (arg4 == 2) {
				if (arg0 == 0) {
					method192(arg2, arg1, 66560);
					method192(arg2 - 1, arg1, 4096);
					method192(arg2, arg1 + 1, 16384);
				}

				if (arg0 == 1) {
					method192(arg2, arg1, 5120);
					method192(arg2, arg1 + 1, 16384);
					method192(arg2 + 1, arg1, 0x10000);
				}

				if (arg0 == 2) {
					method192(arg2, arg1, 20480);
					method192(arg2 + 1, arg1, 0x10000);
					method192(arg2, arg1 - 1, 1024);
				}

				if (arg0 == 3) {
					method192(arg2, arg1, 81920);
					method192(arg2, arg1 - 1, 1024);
					method192(arg2 - 1, arg1, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("EAREBDMK.a(IIIIIIZ)V")
	public void method190(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = 256;
		if (arg5) {
			var7 += 0x20000;
		}

		arg4 -= field611;
		arg0 -= field612;

		if (arg2 == 1 || arg2 == 3) {
			int var8 = arg1;
			arg1 = arg3;
			arg3 = var8;
		}

		for (int var9 = arg4; var9 < arg1 + arg4; var9++) {
			if (var9 >= 0 && var9 < field613) {
				for (int var10 = arg0; var10 < arg0 + arg3; var10++) {
					if (var10 >= 0 && var10 < field614) {
						method192(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("EAREBDMK.a(III)V")
	public void method191(int arg0, int arg1) {
		arg0 -= field611;
		arg1 -= field612;
		field615[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("EAREBDMK.b(III)V")
	public void method192(int arg0, int arg1, int arg2) {
		field615[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("EAREBDMK.a(ZZIIII)V")
	public void method193(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg2 -= field611;
		arg4 -= field612;
		if (arg3 == 0) {
			if (arg1 == 0) {
				method195(arg2, 128, arg4);
				method195(arg2 - 1, 8, arg4);
			}

			if (arg1 == 1) {
				method195(arg2, 2, arg4);
				method195(arg2, 32, arg4 + 1);
			}

			if (arg1 == 2) {
				method195(arg2, 8, arg4);
				method195(arg2 + 1, 128, arg4);
			}

			if (arg1 == 3) {
				method195(arg2, 32, arg4);
				method195(arg2, 2, arg4 - 1);
			}
		}

		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				method195(arg2, 1, arg4);
				method195(arg2 - 1, 16, arg4 + 1);
			}

			if (arg1 == 1) {
				method195(arg2, 4, arg4);
				method195(arg2 + 1, 64, arg4 + 1);
			}

			if (arg1 == 2) {
				method195(arg2, 16, arg4);
				method195(arg2 + 1, 1, arg4 - 1);
			}

			if (arg1 == 3) {
				method195(arg2, 64, arg4);
				method195(arg2 - 1, 4, arg4 - 1);
			}
		}

		if (arg3 == 2) {
			if (arg1 == 0) {
				method195(arg2, 130, arg4);
				method195(arg2 - 1, 8, arg4);
				method195(arg2, 32, arg4 + 1);
			}

			if (arg1 == 1) {
				method195(arg2, 10, arg4);
				method195(arg2, 32, arg4 + 1);
				method195(arg2 + 1, 128, arg4);
			}

			if (arg1 == 2) {
				method195(arg2, 40, arg4);
				method195(arg2 + 1, 128, arg4);
				method195(arg2, 2, arg4 - 1);
			}

			if (arg1 == 3) {
				method195(arg2, 160, arg4);
				method195(arg2, 2, arg4 - 1);
				method195(arg2 - 1, 8, arg4);
			}
		}

		if (arg0) {
			if (arg3 == 0) {
				if (arg1 == 0) {
					method195(arg2, 0x10000, arg4);
					method195(arg2 - 1, 4096, arg4);
				}

				if (arg1 == 1) {
					method195(arg2, 1024, arg4);
					method195(arg2, 16384, arg4 + 1);
				}

				if (arg1 == 2) {
					method195(arg2, 4096, arg4);
					method195(arg2 + 1, 0x10000, arg4);
				}

				if (arg1 == 3) {
					method195(arg2, 16384, arg4);
					method195(arg2, 1024, arg4 - 1);
				}
			}

			if (arg3 == 1 || arg3 == 3) {
				if (arg1 == 0) {
					method195(arg2, 512, arg4);
					method195(arg2 - 1, 8192, arg4 + 1);
				}

				if (arg1 == 1) {
					method195(arg2, 2048, arg4);
					method195(arg2 + 1, 32768, arg4 + 1);
				}

				if (arg1 == 2) {
					method195(arg2, 8192, arg4);
					method195(arg2 + 1, 512, arg4 - 1);
				}

				if (arg1 == 3) {
					method195(arg2, 32768, arg4);
					method195(arg2 - 1, 2048, arg4 - 1);
				}
			}

			if (arg3 == 2) {
				if (arg1 == 0) {
					method195(arg2, 66560, arg4);
					method195(arg2 - 1, 4096, arg4);
					method195(arg2, 16384, arg4 + 1);
				}

				if (arg1 == 1) {
					method195(arg2, 5120, arg4);
					method195(arg2, 16384, arg4 + 1);
					method195(arg2 + 1, 0x10000, arg4);
				}

				if (arg1 == 2) {
					method195(arg2, 20480, arg4);
					method195(arg2 + 1, 0x10000, arg4);
					method195(arg2, 1024, arg4 - 1);
				}

				if (arg1 == 3) {
					method195(arg2, 81920, arg4);
					method195(arg2, 1024, arg4 - 1);
					method195(arg2 - 1, 4096, arg4);
					return;
				}
			}
		}
	}

	@ObfuscatedName("EAREBDMK.a(IIIZIII)V")
	public void method194(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg3) {
			var7 += 0x20000;
		}

		arg1 -= field611;
		arg5 -= field612;

		if (arg0 == 1 || arg0 == 3) {
			int var8 = arg2;
			arg2 = arg4;
			arg4 = var8;
		}

		for (int var9 = arg1; var9 < arg1 + arg2; var9++) {
			if (var9 >= 0 && var9 < field613) {
				for (int var10 = arg5; var10 < arg4 + arg5; var10++) {
					if (var10 >= 0 && var10 < field614) {
						method195(var9, var7, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("EAREBDMK.a(IIII)V")
	public void method195(int arg0, int arg1, int arg2) {
		field615[arg0][arg2] &= 0xFFFFFF - arg1;
	}

	@ObfuscatedName("EAREBDMK.a(BII)V")
	public void method196(int arg0, int arg1) {
		arg1 -= field611;
		arg0 -= field612;
		field615[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("EAREBDMK.a(IIIIZII)Z")
	public boolean method197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 == arg5 && arg0 == arg2) {
			return true;
		}

		arg3 -= field611;
		arg0 -= field612;
		arg5 -= field611;
		arg2 -= field612;
		if (arg1 == 0) {
			if (arg4 == 0) {
				if (arg5 - 1 == arg3 && arg0 == arg2) {
					return true;
				}

				if (arg3 == arg5 && arg2 + 1 == arg0 && (field615[arg3][arg0] & 0x1280120) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg2 - 1 == arg0 && (field615[arg3][arg0] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg3 == arg5 && arg2 + 1 == arg0) {
					return true;
				}

				if (arg5 - 1 == arg3 && arg0 == arg2 && (field615[arg3][arg0] & 0x1280108) == 0) {
					return true;
				}

				if (arg5 + 1 == arg3 && arg0 == arg2 && (field615[arg3][arg0] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg5 + 1 == arg3 && arg0 == arg2) {
					return true;
				}

				if (arg3 == arg5 && arg2 + 1 == arg0 && (field615[arg3][arg0] & 0x1280120) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg2 - 1 == arg0 && (field615[arg3][arg0] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg3 == arg5 && arg2 - 1 == arg0) {
					return true;
				}

				if (arg5 - 1 == arg3 && arg0 == arg2 && (field615[arg3][arg0] & 0x1280108) == 0) {
					return true;
				}

				if (arg5 + 1 == arg3 && arg0 == arg2 && (field615[arg3][arg0] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg1 == 2) {
			if (arg4 == 0) {
				if (arg5 - 1 == arg3 && arg0 == arg2) {
					return true;
				}

				if (arg3 == arg5 && arg2 + 1 == arg0) {
					return true;
				}

				if (arg5 + 1 == arg3 && arg0 == arg2 && (field615[arg3][arg0] & 0x1280180) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg2 - 1 == arg0 && (field615[arg3][arg0] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg5 - 1 == arg3 && arg0 == arg2 && (field615[arg3][arg0] & 0x1280108) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg2 + 1 == arg0) {
					return true;
				}

				if (arg5 + 1 == arg3 && arg0 == arg2) {
					return true;
				}

				if (arg3 == arg5 && arg2 - 1 == arg0 && (field615[arg3][arg0] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg5 - 1 == arg3 && arg0 == arg2 && (field615[arg3][arg0] & 0x1280108) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg2 + 1 == arg0 && (field615[arg3][arg0] & 0x1280120) == 0) {
					return true;
				}

				if (arg5 + 1 == arg3 && arg0 == arg2) {
					return true;
				}

				if (arg3 == arg5 && arg2 - 1 == arg0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg5 - 1 == arg3 && arg0 == arg2) {
					return true;
				}

				if (arg3 == arg5 && arg2 + 1 == arg0 && (field615[arg3][arg0] & 0x1280120) == 0) {
					return true;
				}

				if (arg5 + 1 == arg3 && arg0 == arg2 && (field615[arg3][arg0] & 0x1280180) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg2 - 1 == arg0) {
					return true;
				}
			}
		}

		if (arg1 == 9) {
			if (arg3 == arg5 && arg2 + 1 == arg0 && (field615[arg3][arg0] & 0x20) == 0) {
				return true;
			}

			if (arg3 == arg5 && arg2 - 1 == arg0 && (field615[arg3][arg0] & 0x2) == 0) {
				return true;
			}

			if (arg5 - 1 == arg3 && arg0 == arg2 && (field615[arg3][arg0] & 0x8) == 0) {
				return true;
			}

			if (arg5 + 1 == arg3 && arg0 == arg2 && (field615[arg3][arg0] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("EAREBDMK.a(IIIIIII)Z")
	public boolean method198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg5 && arg3 == arg4) {
			return true;
		}

		arg5 -= field611;
		arg3 -= field612;
		arg1 -= field611;
		arg4 -= field612;
		if (arg2 == 6 || arg2 == 7) {
			if (arg2 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}

			if (arg0 == 0) {
				if (arg1 + 1 == arg5 && arg3 == arg4 && (field615[arg5][arg3] & 0x80) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg4 - 1 == arg3 && (field615[arg5][arg3] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg1 - 1 == arg5 && arg3 == arg4 && (field615[arg5][arg3] & 0x8) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg4 - 1 == arg3 && (field615[arg5][arg3] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg1 - 1 == arg5 && arg3 == arg4 && (field615[arg5][arg3] & 0x8) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg4 + 1 == arg3 && (field615[arg5][arg3] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg1 + 1 == arg5 && arg3 == arg4 && (field615[arg5][arg3] & 0x80) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg4 + 1 == arg3 && (field615[arg5][arg3] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg2 == 8) {
			if (arg1 == arg5 && arg4 + 1 == arg3 && (field615[arg5][arg3] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg5 && arg4 - 1 == arg3 && (field615[arg5][arg3] & 0x2) == 0) {
				return true;
			}

			if (arg1 - 1 == arg5 && arg3 == arg4 && (field615[arg5][arg3] & 0x8) == 0) {
				return true;
			}

			if (arg1 + 1 == arg5 && arg3 == arg4 && (field615[arg5][arg3] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("EAREBDMK.a(IIIIIIII)Z")
	public boolean method199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg1 + arg2 - 1;
		int var9 = arg5 + arg6 - 1;
		if (arg3 >= arg1 && arg3 <= var8 && arg4 >= arg5 && arg4 <= var9) {
			return true;
		}

		if (arg1 - 1 == arg3 && arg4 >= arg5 && arg4 <= var9 && (field615[arg3 - field611][arg4 - field612] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg3 && arg4 >= arg5 && arg4 <= var9 && (field615[arg3 - field611][arg4 - field612] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		}

		if (arg5 - 1 == arg4 && arg3 >= arg1 && arg3 <= var8 && (field615[arg3 - field611][arg4 - field612] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg4 && arg3 >= arg1 && arg3 <= var8 && (field615[arg3 - field611][arg4 - field612] & 0x20) == 0 && (arg0 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
